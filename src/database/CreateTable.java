/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author DungxBuif
 */
public class CreateTable {
    ConnectCSDL conn = new ConnectCSDL();
   
    
    public void Create_TableNhanVien() {
        String sql =    "CREATE TABLE NHANVIEN(MaNV VARCHAR(5) PRIMARY KEY,"+
                        "HoTen VARCHAR(50) NOT NULL," +
                        "NgaySinh VARCHAR(50) NOT NULL,"+
                        "DiaChi VARCHAR(50) NOT NULL,"+
                        "SoDT VARCHAR(50) NOT NULL,"+
                        "GioiTinh VARCHAR(50) NOT NULL)";              
        conn.doSQL(sql);
    }
    public void Create_TableSanPham() {
        String sql =    "CREATE TABLE SANPHAM(MaSP VARCHAR(10) PRIMARY KEY,"+
                        "TenSP VARCHAR(50) NOT NULL," +
                        "DonViTinh VARCHAR(50) NOT NULL," +
                        "Gia INTEGER NOT NULL)";
        conn.doSQL(sql);
    }
    public void Create_TableHoaDon() {
        String sql =    "CREATE TABLE HOADON(MaHD VARCHAR(10) PRIMARY KEY,"+
                        "MaNV VARCHAR(5) NOT NULL," +
                        "LoaiHD VARCHAR(50) NOT NULL,"+
                        "NgayLap VARCHAR(50) NOT NULL," +
                        "NgayGiaoNhan VARCHAR(50) NOT NULL," +
                        "DienGiai VARCHAR(50) NOT NULL,"+
                        "CONSTRAINT fk_MaNV "+
                        "FOREIGN KEY (MaNV)" +
                        "REFERENCES NHANVIEN(MaNV))";
        conn.doSQL(sql);
    }
    public void Create_TableChiTietHD() {
        String sql =    "CREATE TABLE CHITIETHD(MaHD VARCHAR(10) NOT NULL,"+
                        "MaSP VARCHAR(10) NOT NULL," +
                        "LoaiHD VARCHAR(50) NOT NULL,"+
                        "SoLuong INTEGER NOT NULL,"+
                        "DonGia INTEGER NOT NULL,"+
                        "CONSTRAINT fk_MaHD "+
                        "FOREIGN KEY (MaHD)" +
                        "REFERENCES HOADON(MaHD),"+
                        "CONSTRAINT fk_MaSP "+
                        "FOREIGN KEY (MaSP)" +
                        "REFERENCES SANPHAM(MaSP))";
        conn.doSQL(sql);
    }
}
