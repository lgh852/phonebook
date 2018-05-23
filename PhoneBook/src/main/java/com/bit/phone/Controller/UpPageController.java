package com.bit.phone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.ViewPageModel;
import com.bit.phone.service.ListPageService;

@Controller
public class UpPageController {

	@Autowired
	ListPageService service;

	@RequestMapping("/loginck/pageUp")
	public String uppage(@RequestParam("pageCnt") String pageCnt, ViewPageModel pagemodel, Model model) {
		String page = "../loginck/ListView.jsp";
		// 요청이 들어왔을떄 현재 페이지 번호에다가 +1 min 값을 수정
		pageCnt = service.pageCntUp(pageCnt);

		List<FrenAll> fren = service.selectpageNum(pageCnt, pagemodel);
		pagemodel = service.totalCnt(pagemodel, pageCnt);

		model.addAttribute("fren", fren);

		model.addAttribute("msg", "AllFriends");

		model.addAttribute("pagemodel", pagemodel);
		model.addAttribute("page", page);

		return "phonebook/main";
	}
}
