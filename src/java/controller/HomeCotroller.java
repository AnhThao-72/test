/*
* HomeController.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
*/
package controller;

import dal.ArticleDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

/**
 * HomeController.<br>
 * 
 * <pre>
 * 
 *  Lấy ra 1 hình mới nhất để làm ảnh đầu tiên và lấy các ảnh còn lại và các bài viết hiển thị ra với thông tin ngắn
 *  Class thực hiện các class sau :
 *  processRequest
 *  doGet
 *  doPost 
 * 
 * </pre>
 *
 * @author FU ThaoVHHE130573
 * @version 1.0
 */
public class HomeCotroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * lấy ra tổng số bài báo có trong database <br>
     * phân trang<br>
     * bắt các lỗi và exception<br>
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ArticleDAO dao = new ArticleDAO();
            int pageCount = dao.countAllArticles();

            final int page_size = 3;
            //chia trang
            pageCount = (pageCount % page_size == 0) ? pageCount / page_size : pageCount / page_size + 1;
            List<Integer> listCount = new ArrayList<>();
            //add số trang có thể có
            for (int i = 1; i <= pageCount; i++) {
                listCount.add(i);
            }
            String page_raw = request.getParameter("pageindex");
            if (page_raw == null) {
                page_raw = "1";
            }
            int pageIndex = Integer.parseInt(page_raw);
            List<Article> articles = dao.getListArticle(pageIndex, page_size);

            request.setAttribute("pageindex", pageIndex);
            request.setAttribute("articles", articles);
            request.setAttribute("listCount", listCount);
            //đẩy dự liệu sang trang Home.jsp
            request.getRequestDispatcher("Home.jsp").forward(request, response);
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
