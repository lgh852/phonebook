package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.service.GuestListService;


@Controller
public class BoardDeleteController {

	@Autowired
	GuestListService service;
	@RequestMapping("/loginck/boardListDelete")
	public String delete(@RequestParam("idx")String idx,Model model) {
		String view = "redirect:/loginck/boardlist";
		
		int resultCnt = service.guestListDelete(idx);
		
		if(resultCnt<0) {
			view = "phonebook/main";
			String msg = "로그인 실패";
			model.addAttribute("msg",msg);
		}
		
		
		return view;
	}
}
