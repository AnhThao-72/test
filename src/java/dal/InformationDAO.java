/*
* InformationDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Information;

/**
 * InformationDAO.<br>
 *
 * <pre>
 Class dùng các câu query để lấy dữ liệu từ database
 Trong class này sẽ tiến hành các xử lí dưới đây.

 . getInfo


 </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class InformationDAO extends DBContext {

    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * getInfo.<br>
     * Trả về 1 bản ghi của thông tin cửa hàng
     *
     *
     * @return an Information
     */
    public Information getInfo() {
        try {
            String sql = "select * from Information";
            getConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Information info = new Information();
                info.setId(rs.getInt("id"));
                info.setAddress(rs.getString("address"));
                info.setEmail(rs.getString("email"));
                info.setTel(rs.getString("phone"));
                info.setOpenDay(rs.getString("openDay"));
                info.setImagePath(rs.getString("imagePath"));
                return info;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                close(connection, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(InformationDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
