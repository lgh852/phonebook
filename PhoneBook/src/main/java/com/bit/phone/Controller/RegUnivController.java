package com.bit.phone.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.Model.Univ_inf;
import com.bit.phone.service.FriendService;

@Controller
@RequestMapping("/loginck/regUnivForm")
public class RegUnivController {

	@Autowired
	FriendService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public String regUnivForm(Model model) {
		String page = "../loginck/regUnivForm.jsp";
		model.addAttribute("page",page);
		model.addAttribute("msg","UnivFriends");
		
		return "phonebook/main";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String regUniv(Univ_inf univ,HttpSession session,HttpServletRequest request,Model model) throws IllegalStateException, IOException {
		String msg = "";
		try {
		Mmbr_inf Mmbr=(Mmbr_inf)session.getAttribute("user");
		
		int resultCnt = service.UnivInsert(univ,Mmbr,request);
		
		if(resultCnt>0) {
			msg = "정상적으로 입력되었습니다";
		}
		
		}catch(NullPointerException e){
			
			msg ="정상적으로 입력되지 않았습니다";
			
		}finally {
			model.addAttribute("msg",msg);
		}
		return "phonebook/main";
	}
}
