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
public class QLNhaniVien {

    ConnectCSDL cn = new ConnectCSDL();
    // Quản lý sinh vien
    public ResultSet GetDataQLNV() throws SQLException
    {
        cn.getConnect();
        String sql = "select * from NHANVIEN";
        PreparedStatement ps = cn.con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    public void addNhanVien(String MaNV, String TenNV, String NgaySinh, String DiaChi, String SDT , String GioiTinh) throws Exception 
    {
        cn.getConnect();
        String vd = "insert into NHANVIEN values(?, ?, ?, ?, ?, ?) ";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaNV);
        ps.setString(2,TenNV);
        ps.setString(3,NgaySinh); 
        ps.setString(4,DiaChi);
        ps.setString(5,SDT);
        ps.setString(6,GioiTinh);
        ps.executeUpdate();
    }
    public void updateNhanVien(String MaNV, String TenNV, String NgaySinh, String DiaChi, String SDT , String GioiTinh) throws Exception
    {
        cn.getConnect();
        String vd = "update NHANVIEN set HoTen= ?,NgaySinh= ?,DiaChi= ?,SoDT= ?,GioiTinh= ? where MaNV = ?";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(6,MaNV);
        ps.setString(1,TenNV);
        ps.setString(2,NgaySinh); 
        ps.setString(3,DiaChi);
        ps.setString(4,SDT);
        ps.setString(5,GioiTinh);
        ps.executeUpdate();
    }
    public void removeNhanVien(String MaNV)throws Exception
    {
        cn.getConnect();
        String vd = ("delete from NHANVIEN where MaNV = ?");
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaNV);
        ps.executeUpdate();
    }
    
    
}
