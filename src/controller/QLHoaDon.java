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
public class QLHoaDon {

    ConnectCSDL cn = new ConnectCSDL();
    
    public ResultSet GetDataQLHD() throws SQLException
    {
        cn.getConnect();
        String sql = "select * from HOADON";
        PreparedStatement ps = cn.con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    public void addHoaDon(String MaHD, String MaNV, String LoaiHD, String NgayLap, String NgayGiaoNhan , String DienGiai) throws Exception 
    {
        cn.getConnect();
        String vd = "insert into HOADON values(?, ?, ?, ?, ?, ?) ";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaHD);
        ps.setString(2,MaNV);
        ps.setString(3,LoaiHD); 
        ps.setString(4,NgayLap);
        ps.setString(5,NgayGiaoNhan);
        ps.setString(6,DienGiai);
        ps.executeUpdate();
    }
    public void updateHoaDon(String MaHD, String MaNV, String LoaiHD, String NgayLap, String NgayGiaoNhan , String DienGiai) throws Exception
    {
        cn.getConnect();
        String vd = "update HOADON set MaNV= ?,LoaiHD= ?,NgayLap= ?,NgayGiaoNhan= ?,DienGiai= ? where MaHD = ?";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(6,MaHD);
        ps.setString(1,MaNV);
        ps.setString(2,LoaiHD); 
        ps.setString(3,NgayLap);
        ps.setString(4,NgayGiaoNhan);
        ps.setString(5,DienGiai);
        ps.executeUpdate();
    }
    public void removeHoaDon(String MaHD)throws Exception
    {
        cn.getConnect();
        String vd = ("delete from HOADON where MaHD = ?");
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaHD);
        ps.executeUpdate();
    }
    
    
}
