package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.phone.Model.GuestList;
import com.bit.phone.service.GuestListService;

@Controller
@RequestMapping("/loginck/boardForm")
public class BoardFormController {
	@Autowired
	GuestListService listService;

	@RequestMapping(method = RequestMethod.GET)
	public String GuestListForm(Model model) {
		String view = "phonebook/main";
		String page = "../loginck/boardListForm.jsp";
		model.addAttribute("page",page);
		return view;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String GuestList(GuestList guestlist, Model Model) {
		
		String view = "redirect:/loginck/boardlist";
	
		int rsultCnt = listService.GuestListInsert(guestlist);
		if (rsultCnt < 0) {
			 view = "phonebook/main";
			Model.addAttribute("msg", "정상적으로 실행되지 않았습니다");
		}else {
		Model.addAttribute("msg", "정상적으로 실행되었습니다");

		}

		return view;
	}

}
