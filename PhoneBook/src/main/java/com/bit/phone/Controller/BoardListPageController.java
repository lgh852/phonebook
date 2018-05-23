package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.GuestList;
import com.bit.phone.service.GuestListService;

@Controller
public class BoardListPageController {
	@Autowired
	GuestListService listService;

	@RequestMapping("/loginck/boardListPage")
	public String listpage(@RequestParam("idx") String idx, Model model) {
		String view = "phonebook/main";
		String page = "";
		if (idx != null) {
			page = "../loginck/boardListPage.jsp";
			model.addAttribute("page", page);
			GuestList guestlist = listService.selectByIdx(idx);
			int listcount = guestlist.getListcount();
			listcount = listcount + 1;
			System.out.println(listcount);
			listService.listCount(listcount, idx);
			model.addAttribute("guestlist", guestlist);
		} else {
			model.addAttribute("page", page);
			model.addAttribute("msg", "오류!");
		}
		return view;
	}
	
	


}
