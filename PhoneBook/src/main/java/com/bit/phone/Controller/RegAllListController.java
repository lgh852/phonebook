package com.bit.phone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.ViewPageModel;
import com.bit.phone.service.FriendService;
import com.bit.phone.service.ListPageService;

@Controller
public class RegAllListController {

	@Autowired
	FriendService service;
	
	@Autowired
	ListPageService	pageService;
	
	@RequestMapping("/loginck/ListView")
	public String RegAllList(Model model,ViewPageModel pagemodel) {
		String page ="../loginck/ListView.jsp";
		model.addAttribute("page",page);
		String nowPage ="1";
		List<FrenAll> fren = service.selectFrenList();
		pagemodel= pageService.totalCnt(pagemodel,nowPage);
		
		model.addAttribute("fren",fren);
		model.addAttribute("msg","AllFriends");
		model.addAttribute("pagemodel",pagemodel);
		
		return "phonebook/main";
		
	}
	
	
}
