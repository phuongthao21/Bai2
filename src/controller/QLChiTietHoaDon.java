/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.ConnectCSDL;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author ADMIN
 */
public class QLChiTietHoaDon {

    ConnectCSDL cn = new ConnectCSDL();
  
    public ResultSet GetDataQLChiTietHD() throws SQLException
    {
        cn.getConnect();
        String sql = "select * from CHITIETHD";
        PreparedStatement ps = cn.con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    public void addChiTietHD(String MaHD, String MaSP, String LoaiHD, Integer SoLuong, Integer DonGia) throws Exception 
    {
        cn.getConnect();
        String vd = "insert into CHITIETHD values(?, ?, ?, ?, ?) ";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaHD);
        ps.setString(2,MaSP);
        ps.setString(3,LoaiHD); 
        ps.setInt(4,SoLuong);
        ps.setInt(5,DonGia);
     
        ps.executeUpdate();
    }
    public void updateChiTietHD(String MaHD, String MaSP, String LoaiHD, Integer SoLuong, Integer DonGia) throws Exception
    {
        cn.getConnect();
        String vd = "update CHITIETHD set LoaiHD= ?,SoLuong= ?,DonGia= ? where MaHD=?, MaSP = ?";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(5,MaSP);
        ps.setString(4,MaHD);
        ps.setString(1,LoaiHD); 
        ps.setInt(2,SoLuong);
        ps.setInt(3,DonGia);
   
        ps.executeUpdate();
    }
    public void removeChiTietHD(String MaHD, String MaSP)throws Exception
    {
        cn.getConnect();
        String vd = ("delete from CHITIETHD where MaHD = ?,MaSP= ?");
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaHD);
        ps.setString(2,MaSP);
        ps.executeUpdate();
    }

    public void addChiTietHD(String text, String text0, String text1, int parseInt, String text2, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
