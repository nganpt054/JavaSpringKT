package org.o7planning.hellospringmvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.khachhangbean;
import org.o7planning.hellospringmvc.bo.khachhangbo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class htkhachhang {
	@RequestMapping("/khachhang")
	public void  htkhachhang( HttpServletRequest request, HttpSession session) {
		try {
			String hoten=request.getParameter("txtfind");
			khachhangbo khbo=new khachhangbo();
			ArrayList<khachhangbean> dskh=khbo.gethoten(hoten);
			 new ModelAndView("hienthi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
