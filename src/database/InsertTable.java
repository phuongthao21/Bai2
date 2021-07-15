/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


/**
 *
 * @author ADMIN
 */
public class InsertTable {
    ConnectCSDL conn = new ConnectCSDL();
    public void Insert_NhanVien(){
        String sql = "INSERT INTO NHANVIEN VALUES('NV01','Nguyễn Phương Thảo','20/11/2000','Hà Tĩnh','09876','Nữ')\n";
        String sql1 = "INSERT INTO NHANVIEN VALUES('NV02','Nguyễn Phương','29/11/2000','Hà Tĩnh','123456','Nữ')\n";
        conn.doSQL(sql);
        conn.doSQL(sql1);
    }
    public void Insert_SanPham(){
        String sql ="INSERT INTO SANPHAM VALUES ('SP01', 'Quần Bò','Chiếc',300000)\n" ;
        String sql1 ="INSERT INTO SANPHAM VALUES ('SP02', 'Áo Bò','Chiếc',200000)\n" ;
        String sql2 ="INSERT INTO SANPHAM VALUES ('SP03', 'Mũ','Chiếc',30000)\n" ;
        String sql3 ="INSERT INTO SANPHAM VALUES ('SP04', 'Giày','Đôi',250000)\n" ;     
        conn.doSQL(sql);
        conn.doSQL(sql1);
        conn.doSQL(sql2);
        conn.doSQL(sql3);   
    }
    public void Insert_HoaDon(){
        
        String sql ="INSERT INTO HOADON VALUES ('HD01', 'NV01','Nhập','20/12/2020','11/01/2021','Không')\n" ;
        String sql1 ="INSERT INTO HOADON VALUES ('HD02', 'NV01','Xuất','20/12/2020','11/01/2021','Không')\n" ;
        String sql2 ="INSERT INTO HOADON VALUES ('HD03', 'NV02','Trả','20/12/2020','11/01/2021','Không')\n" ;
        String sql3 ="INSERT INTO HOADON VALUES ('HD04', 'NV01','Nhập','20/12/2020','11/01/2021','Không')\n" ;
        conn.doSQL(sql);
        conn.doSQL(sql1);
        conn.doSQL(sql2);
        conn.doSQL(sql3);
    }
    public void Insert_ChiTietHD(){
        String sql="INSERT INTO CHITIETHD VALUES ('HD01','SP01','Nhập',3,400000) \n";
        String sql1="INSERT INTO CHITIETHD VALUES ('HD01','SP02','Nhập',5,450000) \n";
        String sql2="INSERT INTO CHITIETHD VALUES ('HD02','SP03','Xuất',4,200000) \n";
        String sql3="INSERT INTO CHITIETHD VALUES ('HD03','SP04','Trả',3,450000) \n";
        
        conn.doSQL(sql);
        conn.doSQL(sql1);
        conn.doSQL(sql2);
        conn.doSQL(sql3);
       
    }
   
}
