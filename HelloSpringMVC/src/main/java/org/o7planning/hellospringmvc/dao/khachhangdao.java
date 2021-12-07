package org.o7planning.hellospringmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.khachhangbean;

public class khachhangdao {
public khachhangbean getkh(String un,String pass) throws Exception{
		
		//B1: kết nối
				DungChung dc = new DungChung();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from KhachHang where tendn=? and pass=?";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				//Truyền 01 tham số: un; pas vào cmd
				cmd.setString(1, un);
				cmd.setString(2, pass);
				ResultSet rs = cmd.executeQuery();
				//Nếu rs.next==false return null
				// else: return kh;
					// Tạo ra 1 khachhang:kh và return kh;
				if (rs.next()==false) return null;
				else {
					
					String makh=rs.getString("makh");
		    		String hoten=rs.getString("hoten");
		    		String diachi=rs.getString("diachi");
		    		String tendn=rs.getString("tendn");
		    		String matkhau=rs.getString("pass");
		    		khachhangbean kh=new khachhangbean(makh, hoten, diachi, tendn, matkhau);
		    		rs.close();
			    	dc.cn.close();
		    		return kh;
					}
		    	//Dong ket noi	
	}
public ArrayList<khachhangbean> getkh(String hotenkh) throws Exception{
	ArrayList<khachhangbean> ds=new ArrayList<khachhangbean>();
	//B1: kết nối
			DungChung dc = new DungChung();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "Select * from KhachHang where hoten=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyền 01 tham số: un; pas vào cmd
			cmd.setString(1, hotenkh);
			
			ResultSet rs = cmd.executeQuery();
			//Nếu rs.next==false return null
			// else: return kh;
				// Tạo ra 1 khachhang:kh và return kh;
			while (rs.next())
			{
				
				String makh=rs.getString("makh");
	    		String hoten=rs.getString("hoten");
	    		String diachi=rs.getString("diachi");
	    		String tendn=rs.getString("tendn");
	    		String matkhau=rs.getString("pass");
	    		ds.add(new khachhangbean(makh, hoten, diachi, tendn, matkhau));
				}
			rs.close();
	    	dc.cn.close();
    		return ds;
	    	//Dong ket noi	
}

}
