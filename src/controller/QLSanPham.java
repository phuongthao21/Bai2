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
public class QLSanPham {

    ConnectCSDL cn = new ConnectCSDL();

    public ResultSet GetDataQLSP() throws SQLException
    {
        cn.getConnect();
        String sql = "select * from SANPHAM";
        PreparedStatement ps = cn.con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
    }
    public void addSanPham(String MaSP, String TenSP, String DơnViTinh, Integer DonGia) throws Exception 
    {
        cn.getConnect();
        String vd = "insert into SANPHAM values(?, ?, ?, ?) ";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaSP);
        ps.setString(2,TenSP);
        ps.setString(3,DơnViTinh); 
        ps.setInt(4,DonGia);
        ps.executeUpdate();
    }
    public void updateSanPham(String MaSP, String TenSP, String DonViTinh, Integer DonGia) throws Exception
    {
        cn.getConnect();
        String vd = "update SANPHAM set TenSP= ?,DonViTinh= ?,Gia= ? where MaSP = ?";
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(4,MaSP);
        ps.setString(1,TenSP);
        ps.setString(2,DonViTinh); 
        ps.setInt(3,DonGia);
      
        ps.executeUpdate();
    }
    public void removeSanPham(String MaSP)throws Exception
    {
        cn.getConnect();
        String vd = ("delete from SANPHAM where MaSP = ?");
        PreparedStatement ps = cn.con.prepareStatement(vd);
        ps.setString(1,MaSP);
        ps.executeUpdate();
    }
    
    
}
