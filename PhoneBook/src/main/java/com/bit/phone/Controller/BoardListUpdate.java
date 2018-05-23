package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.GuestList;
import com.bit.phone.service.GuestListService;

@Controller
@RequestMapping("/loginck/boardListUpdate")
public class BoardListUpdate {
	@Autowired
	GuestListService listService;

	@RequestMapping(method = RequestMethod.GET)
	public String viewUpdateForm(GuestList guestlist, @RequestParam("idx") String idx, Model model) {
		String view = "phonebook/main";
		if (idx != null) {

			String page = "../loginck/boardListUpdate.jsp";

			guestlist = listService.selectByIdx(idx);

			model.addAttribute("guestlist", guestlist);
			model.addAttribute("page",page);

		} else {

			model.addAttribute("msg", "수정불가");
		}
		return view;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String viewUpdate(GuestList guestlist, Model model) {

		String view = "redirect:/loginck/boardlist";

		if (guestlist != null) {

			System.out.println(guestlist);
			int resultCnt = listService.listUpdate(guestlist);
			if (resultCnt < 0) {
					model.addAttribute("msg", "수정불가");
			}
		} else {
			view = "phonebook/main";

		}
		return view;

	}

}
