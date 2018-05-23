package com.bit.phone.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.service.MemberService;

@Controller

@RequestMapping(value = "/phonebook/memberRegForm")
public class MemberRegController {

	@Autowired
	MemberService service;

	@RequestMapping(method = RequestMethod.GET)
	public String memberRegForm(Model model) {

		String page = "memberRegForm.jsp";
		model.addAttribute("page", page);

		return "phonebook/main";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String memberReg(Model model, Mmbr_inf member, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String msg = "회원가입이 성공적으로 되었습니다";

		int resultCnt = service.insertMember(member, request);
		
		if (resultCnt < 0) {
			msg = "회원가입에 실패하였습니다";
		}
		model.addAttribute("msg", msg);
		

		return "phonebook/main";
	}
}
