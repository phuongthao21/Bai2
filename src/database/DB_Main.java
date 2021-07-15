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
public class DB_Main {

    /**
     * @param args the command line arguments
     */
    static CreateTable cr = new CreateTable();
    static InsertTable is= new InsertTable();
    public static void main(String[] args) {
        try{
            cr.Create_TableNhanVien();
            cr.Create_TableSanPham();
            cr.Create_TableHoaDon();
            cr.Create_TableChiTietHD();   
            is.Insert_NhanVien();
            is.Insert_SanPham();
            is.Insert_HoaDon();
            is.Insert_ChiTietHD();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
