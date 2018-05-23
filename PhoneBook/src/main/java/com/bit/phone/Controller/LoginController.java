package com.bit.phone.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.service.MemberService;

@Controller
public class LoginController {

	@Autowired
	MemberService service;

	@RequestMapping(value = "/phonebook/loginForm", method = RequestMethod.GET)
	public String loginform(Model model) {

		String page = "loginForm.jsp";

		model.addAttribute("page", page);

		return "phonebook/main";
	}

	@RequestMapping(value = "/phonebook/loginForm", method = RequestMethod.POST)
	public String login(@RequestParam("mmbr_id") String member_id, @RequestParam("mmbr_password") String password,
			Model model, HttpSession session) {

		Mmbr_inf user = service.selectByid(member_id, password);
		String page = "phonebook/main";

		String msg = "";
		if (user != null) {
			msg = user.getMmbr_nm() + "님 환영합니다";
			model.addAttribute("msg", msg);
		} else {
			msg = "비밀번호와 아이디를 확인해주세요";
			model.addAttribute("msg",msg);
			model.addAttribute("page", page);

		}

		
		session.setAttribute("user", user);
		session.setMaxInactiveInterval(60 * 60 * 60);
		// 세션 저장
		return page;

	}

}
