package org.o7planning.hellospringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.khachhangbean;
import org.o7planning.hellospringmvc.bo.khachhangbo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class dangnhap {
	@RequestMapping("/dangnhap")
	public ModelAndView  dangnhap(Model model, HttpServletRequest request, HttpSession session) {
		try {
			String un=request.getParameter("txtun");
			String pass=request.getParameter("txtpass");
			khachhangbo khbo= new khachhangbo();
			if(un==null) {//neu lan dau
				return new ModelAndView("dangnhap");
			}else{
                khachhangbean kh=khbo.ktdn(un, pass);
				if(kh!=null){//Dang nhap dung
					session.setAttribute("kh", kh);
					//return "redirect:/hello";
					//return new ModelAndView("redirect:/hello");
					return new ModelAndView("hienthi");
				}
           else{//dang nhap sai
					model.addAttribute("tb", "Dang nhap sai");
					return new ModelAndView("dangnhap");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
		
	}

}
