/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.QuizDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Quiz;
import model.User;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ManageQuizControl", urlPatterns = {"/manageQuiz"})
public class ManageQuizControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        QuizDAO quizDAO = new QuizDAO();
        HttpSession ses = request.getSession();
        
        User user = (User) ses.getAttribute("user");
        
        int index = Integer.parseInt(request.getParameter("indexPage"));
        int rowCount = quizDAO.getNumberOfQuestionByTeacher(user.getUser());
        //maximum 3 question each page
        int size = 3;
        int endPage = (int) rowCount / size;
        //If the number of pages is not divisible by size, increment by 1
        if (rowCount % size != 0) {
            endPage++;
        }
        
        HashMap<Integer, Quiz> hmQuiz = quizDAO.getAllQuizByTeacher(user.getUser(), index);
        
        request.setAttribute("endPage", endPage);
        request.setAttribute("hmQuiz", hmQuiz);
        request.getRequestDispatcher("ManageQuiz.jsp").forward(request, response);
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
