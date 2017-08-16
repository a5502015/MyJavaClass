/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;
import java.sql.*;
import java.io.*;
/**
 *
 * @author student
 */
public class Testdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:derby://localhost:1527/test";
        String user = "root";
        String pass = "root";
        
        try(Connection con = DriverManager.getConnection(url,user,pass)){
            System.out.println("success");
        }catch(SQLException ex){
            
        }
    }
    
}
