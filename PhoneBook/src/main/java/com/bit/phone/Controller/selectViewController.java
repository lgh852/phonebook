package com.bit.phone.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.service.FriendService;

@Controller
public class selectViewController {

	@Autowired
	FriendService service;

	@RequestMapping("/phonebook/selectView")
	public String selectView(Model model,@RequestParam("fren_nmbr")String fren_nmbr, HttpSession session) {
		String msg;
			System.out.println(fren_nmbr);
			FrenAll fren = service.selectView(fren_nmbr);
		
		String page = "../loginck/selectView.jsp";
		model.addAttribute("fren",fren);
		model.addAttribute("page", page);
		model.addAttribute("msg","Friends");

		return "phonebook/main";
	}
}
