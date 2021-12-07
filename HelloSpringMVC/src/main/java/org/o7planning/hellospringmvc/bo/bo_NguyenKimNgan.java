package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.bean_NguyenKimNgan;
import org.o7planning.hellospringmvc.dao.dao_NguyenKimNgan;

public class bo_NguyenKimNgan {
	dao_NguyenKimNgan sdao = new dao_NguyenKimNgan();
	public ArrayList<bean_NguyenKimNgan> getsv()throws Exception{
		return sdao.getsinhvien();
	}
	public ArrayList<bean_NguyenKimNgan> Tim(ArrayList<bean_NguyenKimNgan> ds, String key){
    	ArrayList<bean_NguyenKimNgan> tam= new ArrayList<bean_NguyenKimNgan>();
    	for(bean_NguyenKimNgan tg: ds)
    		if(tg.getHoTen().toLowerCase().contains(key.toLowerCase())||tg.getDiaChi().toLowerCase().contains(key.toLowerCase()))
    			tam.add(tg);
    	return tam;
 	
	}
}
