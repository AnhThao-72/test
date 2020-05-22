/*
* ArticleDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Article;

/**
 * ArticleDao.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . countAllArticles
 * . getListArticle
 * . getArticleById
 *
 *
 * </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class ArticleDAO extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * countAllArticles.<br>
     * Đếm toàn bộ bài báo có trong database
     *
     *
     * @return number of Article
     */
    public int countAllArticles() {
        int count = 0;
        try {
            String sql = " SELECT COUNT(*) as [count] FROM Article";
            getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            close(connection, ps, rs);
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    /**
     * getListArticle.<br>
     * Trả về các bài báo thỏa mãn
     *
     *
     *
     * @param pageindex
     * @param pagesize
     * @return a list Article
     */
    public List<Article> getListArticle(int pageIndex, int pageSize) {
        List<Article> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM(SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Article) x WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";
            getConnection();
            ps = connection.prepareStatement(sql);
            
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();

            while (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt("id"));
                a.setTitle(rs.getString("title"));
                a.setImagePath(rs.getString("imagePath"));
                a.setShortContent(rs.getString("shortContent"));
                a.setFullContent(rs.getString("fullContent"));

                list.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(connection, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    /**
     * getArticleById.<br>
     * Truyền vào id và tìm bài báo có id trùng với id truyền vào.
     *
     *
     *
     * @param id
     * @return a list Article
     */
    public Article getArticleById(int id) {
        String sql = "Select * from Article where id=?";
        try {
            ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Article a = new Article();
                a.setId(rs.getInt("id"));
                a.setTitle(rs.getString("title"));
                a.setImagePath(rs.getString("imagePath"));
                a.setShortContent(rs.getString("shortContent"));
                a.setFullContent(rs.getString("fullContent"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(connection, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
