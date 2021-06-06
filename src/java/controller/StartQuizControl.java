/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.QuizDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Quiz;

/**
 *
 * @author Admin
 */
@WebServlet(name = "StartQuizControl", urlPatterns = {"/StartQuiz"})
public class StartQuizControl extends HttpServlet {

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
        
        //quantity of question
        int number = Integer.parseInt(request.getParameter("number"));
        int maxNumberOfQuestion = quizDAO.getTotalQuiz();
        //check maximum of question
        if(number > maxNumberOfQuestion || number <= 0){
            request.setAttribute("warming", "Please input number from 0 to " + maxNumberOfQuestion);
            request.getRequestDispatcher("TakeQuizStep1.jsp").forward(request, response);
        }
        
        //number of last question
        int lastQuestionIndex = 0;
        //number of current question
        int currQuestionIndex = lastQuestionIndex + 1;
        //score rate
        double scorePerQuestion =(double) 10 / number;
        
        //current Score
        double currScore = 0;
        //get current question from DB
        Quiz currQuestion = quizDAO.getQuiz(currQuestionIndex);      

        Date d = new Date();
        //set endTime
        d.setMinutes(d.getMinutes() + number);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        ses.setAttribute("takingQuiz", "takingQuiz");
        ses.setAttribute("time", sdf.format(d));
        ses.setAttribute("lastQuestion", currQuestion);
        ses.setAttribute("index", currQuestionIndex);
        ses.setAttribute("score", currScore);
        ses.setAttribute("number", number);
        ses.setAttribute("rate", scorePerQuestion);
        
        response.sendRedirect("TakeQuizStep2.jsp");
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
