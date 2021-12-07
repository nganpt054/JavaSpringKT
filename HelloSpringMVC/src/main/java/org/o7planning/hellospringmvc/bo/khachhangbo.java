package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.khachhangbean;
import org.o7planning.hellospringmvc.dao.khachhangdao;

public class khachhangbo {
	khachhangdao khdao= new khachhangdao();
	khachhangbean kh=new khachhangbean();
	public khachhangbean ktdn(String makh, String matkhau) throws Exception
	   {
		   
	    	return khdao.getkh(makh, matkhau);
	   }
	public ArrayList<khachhangbean> gethoten(String hotenkh) throws Exception
	   {
		   
	    	return khdao.getkh(hotenkh);
	   }

}
