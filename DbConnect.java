/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SURENDRA
 */
public class DbConnect {
    
    public static Connection con;
    public static Statement st;
    public static PreparedStatement CA,insertPrice,getPrice,addBooking;
   
    static{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/busbooking", "root","");
        st=con.createStatement();
        CA=con.prepareStatement("select * from login where name=? and password=?");
        insertPrice=con.prepareStatement("insert into setpr values(?,?)");
        addBooking=con.prepareStatement("insert into booking(Route,price,name,number,date) values(?,?,?,?,?)");
         getPrice=con.prepareStatement("select price from setpr where route=?");
    


}catch(Exception ex){
    ex.printStackTrace();

}
    }
    
}
