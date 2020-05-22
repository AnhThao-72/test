/*
* MenuDAO.java
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
import model.Menu;

/**
 * MenuDAO.<br>
 *
 * <pre>
 Class dùng các câu query để lấy dữ liệu từ database
 Trong class này sẽ tiến hành các xử lí dưới đây.

 . countAllOfMenu
 . getListOfMenu


 </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class MenuDAO extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * countAllOfMenu.<br>
     * Đếm toàn món ăn trong thực đơn ở database
     *
     *
     * @return number of Menu
     */
    public int countAllOfMenu() {
        int count = 0;
        try {
            String sql = " SELECT COUNT(*) as [count] FROM Menu";
            getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(connection, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return count;
    }

    /**
     * getListOfMenu.<br>
     * Trả về các món ăn thỏa mãn thỏa mãn
     *
     *
     *
     * @param pageindex
     * @param pagesize
     * @return a list Article
     */
    public List<Menu> getListOfMenu(int pageIndex, int pageSize) {
        List<Menu> menu = new ArrayList<>();

        try {
            String sql = "SELECT * FROM(SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  Menu) x WHERE row_num >= (? - 1)*? +1 AND row_num<= ? * ?";

            getConnection();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                Menu m = new Menu();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setContent(rs.getString("contentMenu"));
                m.setPrice(rs.getString("price"));

                menu.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(connection, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return menu;
    }
}
