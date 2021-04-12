/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentportal;

import java.util.*;
import java.sql.*;
public class StudentPortal {
    private static Connection x;

    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            x=DriverManager.getConnection("jdbc:mysql://localhost:3306/sukrati","root","Chunmun");
         }
        catch(Exception e){}
        return x;
        
    }
}
