/*
* DBContext.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DBContext.<br>
 *
 * <pre>
 * Class mở kết nối đến sqlServer
 * Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . constructor.
 *
 * </pre>
 *
 * @author anhth
 * @version 1.0
 */
public class DBContext {
    /**
     * Constructor.<br>
     * Mở kết nối tới SQLServer Trường hợp gặp lỗi thực hiện exception.
     */
    protected Connection connection = null;
    public void getConnection() {
        try {
             // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Sushi";
            String username = "sa";
            String password = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        /**
     * Constructor.<br>
     * Đóng kết nối với SQLServer
     *
     * @param con
     * @param ps
     * @param rs
     * @throws java.lang.Exception
     */
    public void close(Connection con, PreparedStatement ps, ResultSet rs) throws SQLException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
}
