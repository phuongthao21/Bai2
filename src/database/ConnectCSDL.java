/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TONG LE TU VAN
 */
public class ConnectCSDL {
    public Connection con=null;    
    Statement sta= null;   
    ResultSet res=null;   
    
    //ket noi den database
   
    public void getConnect() 
    {
        try{
            String url="jdbc:derby://localhost:1527/QuanLyHoaDon";
            String user="administrator";
            String pass="123456";
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=(Connection)DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException|SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Khong the ket noi voi database \n"+e);
            e.printStackTrace();
        }   
    }
    public void doSQL(String sql) {
        getConnect();
        try {
            sta = con.createStatement();
            sta.execute(sql);
            System.out.println("Thực thi thành công");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(" khong thuc hien dc cau lẹnh sql\n" + sql);
        }
    } 

}
