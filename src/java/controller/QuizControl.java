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
@WebServlet(name = "QuizControl", urlPatterns = {"/QuizControl"})
public class QuizControl extends HttpServlet {

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
        int number = (int) ses.getAttribute("number");
        //number of last question
        int lastQuestionIndex = (int) ses.getAttribute("index");
        //number of current question
        int currQuestionIndex = lastQuestionIndex + 1;
        //score rate 
        double scorePerQuestion = (double) ses.getAttribute("rate");
        //current Score
        double lastScore = (double) ses.getAttribute("score");
        double currScore = 0;
        //answer of last question
        String answer = request.getParameter("answer");
        //Timer
        Object timeMinutes = ses.getAttribute("timeMinutes");

        //get result last question
        Quiz lastQuestion = (Quiz) ses.getAttribute("lastQuestion");
        //check answer of last question
        if (lastQuestion.sResult().equals(answer)) {
            currScore = lastScore + scorePerQuestion;
        } else {
            currScore = lastScore;
        }

        //check last question
        //if its not last question =>> continue to next question
        if (currQuestionIndex <= number) {
            Quiz currQuestion = quizDAO.getQuiz(currQuestionIndex);
            
            ses.setAttribute("timeMinutes", timeMinutes);
            ses.setAttribute("lastQuestion", currQuestion);
            ses.setAttribute("index", currQuestionIndex);
            ses.setAttribute("score", currScore);
            ses.setAttribute("number", number);

            request.getRequestDispatcher("TakeQuizStep2.jsp").forward(request, response);
            //if last question =>> notify score
        } else {
            //round to 2 decimal places
            currScore = Math.round(currScore * 100.0) / 100.0;
            double scorePercent = currScore * 10;
            String status = (currScore > 7.0) ? "Passed" : "Failed";

            ses.setAttribute("score", currScore);
            ses.setAttribute("scorePercent", scorePercent);
            ses.setAttribute("status", status);

            response.sendRedirect("TakeQuizScore.jsp");
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
