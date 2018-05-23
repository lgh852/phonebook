package com.bit.phone.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.phone.Model.Mmbr_inf;

@Controller
public class MainController {

	@RequestMapping("/phonebook/main")
	public String main(HttpSession session,Model model) {
		Mmbr_inf mmbr =(Mmbr_inf) session.getAttribute("user");
		if(mmbr!=null) {
			
			String username = mmbr.getMmbr_nm();
			model.addAttribute("msg",username+"님환영합니다");
			
		}else {
			String page = "";
			model.addAttribute("page",page);
			
		}
		return "phonebook/main";
		
	}
}
