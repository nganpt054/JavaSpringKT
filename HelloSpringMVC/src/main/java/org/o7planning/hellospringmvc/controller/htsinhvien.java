package org.o7planning.hellospringmvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.bean_NguyenKimNgan;
import org.o7planning.hellospringmvc.bo.bo_NguyenKimNgan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class htsinhvien {
	@RequestMapping("/htsinhvien")
	public ModelAndView  htsinhvien(Model model, HttpServletRequest request, HttpSession session, HttpServletRequest response) {
		try {
			 response.setCharacterEncoding("utf-8");
				request.setCharacterEncoding("utf-8");
			bo_NguyenKimNgan sv = new bo_NguyenKimNgan();
		 	String key= request.getParameter("txtfind");
		 	ArrayList<bean_NguyenKimNgan> dssv= sv.getsv();
		 	if(key==null)
		 		return new ModelAndView("timkiem");
		 	
		 	else {
		   			dssv=sv.Tim(dssv, key);
		   			if (dssv!=null) 
		   		session.setAttribute("dssv", dssv);
		   	
		   		
		   		 return new ModelAndView("hienthi");
		   	
		   		
		   			}
		   		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
