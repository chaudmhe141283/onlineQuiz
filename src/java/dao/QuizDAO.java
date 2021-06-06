/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import model.Quiz;

/**
 *
 * @author Admin
 */
public class QuizDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public QuizDAO() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception ex) {
            System.out.println("Error in connect to DB");
        }

    }

    public int getTotalQuiz() {
        String sql = "select MAX(r) from(select ROW_NUMBER() over (order by id asc) as r,*\n"
                + "from Quiz) as t";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error when get total Quizs...");
        }
        return 0;
    }

    public Quiz getQuiz(int number) {
        String sql = "select * From\n"
                + "     (select ROW_NUMBER() over (order by id asc) as r,*\n"
                + "                from Quiz) as t\n"
                + "                where r = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, number + "");
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Quiz(
                        rs.getString("question"),
                        rs.getString("option1"),
                        rs.getString("option2"),
                        rs.getString("option3"),
                        rs.getString("option4"),
                        rs.getInt("result"),
                        rs.getDate("date"),
                        rs.getInt("createdBy"));
                
            }
        } catch (Exception e) {
            System.out.println("Error when get Quiz...");
        }
        return null;
    }

    public void makeQuiz(Quiz quiz) {
        String sql = "insert into Quiz values(?,?,?,?,?,?,?,?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, quiz.getQuestion());
            ps.setString(2, quiz.getOption1());
            ps.setString(3, quiz.getOption2());
            ps.setString(4, quiz.getOption3());
            ps.setString(5, quiz.getOption4());
            ps.setString(6, quiz.getResult() + "");
            ps.setString(7, sdf.format(quiz.getDate()));
            ps.setString(8, quiz.getCreatedBy() + "");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error when make quiz...");
        }
    }

    public HashMap<Integer, Quiz> getAllQuizByTeacher(String user, int index) {
        String sql = "select * From ("
                + "select ROW_NUMBER() over (order by id asc) as r,*\n"
                + " from Quiz where createdBy = ("
                + "select id from [User] where [USER] = ?)"
                + ") as t\n"
                + " where r between ? and ?";
        HashMap<Integer, Quiz> hmQuiz = new HashMap<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, index * 3 - 2 + "");
            ps.setString(3, index * 3 + "");
            rs = ps.executeQuery();
            while (rs.next()) {
                hmQuiz.put(rs.getInt(2), new Quiz(
                        rs.getString("question"),
                        rs.getString("option1"),
                        rs.getString("option2"),
                        rs.getString("option3"),
                        rs.getString("option4"),
                        rs.getInt("result"),
                        rs.getDate("date"),
                        rs.getInt("createdBy")));
            }
        } catch (Exception e) {
        }
        return hmQuiz;
    }

    public void editQuestion(int id, Quiz q) {
        String sql = "update Quiz\n"
                + "set question = ?,\n"
                + "option1 = ?,\n"
                + "option2 = ?,\n"
                + "option3 = ?,\n"
                + "option4 = ?,\n"
                + "result = ?\n"
                + "where id = (select id from (select ROW_NUMBER() over (order by id asc) as r,*\n"
                + "                from Quiz\n"
                + "                where id = ?) as t)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, q.getQuestion());
            ps.setString(2, q.getOption1());
            ps.setString(3, q.getOption2());
            ps.setString(4, q.getOption3());
            ps.setString(5, q.getOption4());
            ps.setString(6, q.getResult() + "");
            ps.setString(7, id + "");

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public int getNumberOfQuestionByTeacher(String user) {
        String sql = "select count(*) from Quiz where createdBy = ("
                + "select id from [User] where [USER] = ?"
                + ")";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

}
