/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sarvesh Vishwakarma
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("Enter Your JDBC URL","Enter Your Username","Enter Your Password");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
