/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO {
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public UserDAO() {
        try {
            con = new DBContext().getConnection();
        } catch (Exception ex) {
            System.out.println("Error in connect to DB");
        }
        
    }
    
    public boolean isExisting(String username){
        List<User> listUsers = new ArrayList<>();
        String sql = "select * from [User]";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                listUsers.add(new User(rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        
        for (User user : listUsers) {
            if(user.getUser().equals(username)){
                return true;
            }
        }
        return false;
    }
    
    public User login(String user, String pass){
        String sql = "select * from [User] where [user] = ? and pass = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new User(
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println("Error when login...");
        }
        return null;
    }
    
    public void register(User user){
        String sql = "insert into [User] values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUser());
            ps.setString(2, user.getPass());
            ps.setString(3, user.getType() + "");
            ps.setString(4, user.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error when register...");
        }
    }
    
    public int getIdFromUser(String user){
        String sql = "select id from [User] where [user] = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while(rs.next()){
                return rs.getInt("id");
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        User u = dao.login("ChauDM", "123");
        String result = (u != null)?"success":"failed";
        System.out.println(result);
    }
    
}
