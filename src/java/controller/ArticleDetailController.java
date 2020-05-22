/*
* ArticleDetailController.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package controller;

import dal.ArticleDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

/**
 * ArticleDetailsController.<br>
 *
 * <pre>
 * Class thực hiện việc hiển thị ra bài viết mà người dùng click vào
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . processRequest
 * . doGet.
 * . doPost
 *
 * </pre>
 *
 * @author FU ThaoVHHE130573
 * @version 1.0
 */
public class ArticleDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * lấy ra bài báo theo id <br>
     * bắt các lỗi và exception<br>
     * 
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       try {
            int id = Integer.parseInt(request.getParameter("id"));
            ArticleDAO dao = new ArticleDAO();
            Article article =  dao.getArticleById(id);        
            if(article==null){
                 request.setAttribute("text", "not alive");
            }
            request.setAttribute("article", article);
            //đẩy dữ liệu sang trang ArticleDetail.jsp
            request.getRequestDispatcher("ArticleDetail.jsp").forward(request, response);
        } catch (IOException | NumberFormatException | ServletException ex) {
            request.setAttribute("error", ex.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
