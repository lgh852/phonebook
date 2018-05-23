package com.bit.phone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.ViewPageModel;
import com.bit.phone.service.ListPageService;

@Controller
public class SelectPageController {
	@Autowired
	ListPageService service;
	
	@RequestMapping(value="/loginck/selectpageCnt",method=RequestMethod.GET)
	public String selectpage(Model model,@RequestParam("pageCnt")String pageCnt
			,ViewPageModel pagemodel) {
		String page = "../loginck/ListView.jsp";
		List<FrenAll> fren =service.selectpageNum(pageCnt,pagemodel);
			
		pagemodel= service.totalCnt(pagemodel,pageCnt);
			
		model.addAttribute("fren",fren);
		model.addAttribute("msg","AllFriends");
		model.addAttribute("pagemodel",pagemodel);
		model.addAttribute("page",page);
		
		
		
		return "phonebook/main";
	}
}
