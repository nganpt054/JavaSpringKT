package org.o7planning.hellospringmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.bean_NguyenKimNgan;

public class dao_NguyenKimNgan {
	public ArrayList<bean_NguyenKimNgan> getsinhvien() throws Exception{
		ArrayList<bean_NguyenKimNgan> ds=new ArrayList<bean_NguyenKimNgan>();
		
		//B1: kết nối
		DungChung dc = new DungChung();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "Select * from SinhVien";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
		while(rs.next()) {
			String Masv=rs.getString("Masv");
    		String HoTen=rs.getString("HoTen");
    		String DiaChi=rs.getString("DiaChi");
    		long DTB=rs.getLong("DTB");
    		ds.add(new bean_NguyenKimNgan(Masv, HoTen, DiaChi, DTB));
    		
    	}
		//Dong ket noi
    	rs.close();
    	dc.cn.close();
    	return ds;
	}
}
