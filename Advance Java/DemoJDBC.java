/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ad.javaclg;
import java.sql.*;
/**
 *
 * @author Anshul Pawar
 */
public class DemoJDBC {
    public static void main(String []args) throws SQLException{
         Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1234567");
            if(conn != null){
                System.out.println("successfully connected");
            }   
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Not connected");
        }
        try{
            String sql = "Select * from student";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("Name="+rs.getString(1));
            }
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
