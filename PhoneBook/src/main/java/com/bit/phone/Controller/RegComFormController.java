package com.bit.phone.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.phone.Model.Comp_inf;
import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.service.FriendService;

@Controller
@RequestMapping("/loginck/regComForm")
public class RegComFormController {
	
	@Autowired
	FriendService service;
	
	@RequestMapping(method =RequestMethod.GET)
	public String regComForm(Model model) {
		
		String page ="../loginck/regComForm.jsp";
		model.addAttribute("page",page);
		model.addAttribute("msg","ComFriends");
		return "phonebook/main";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String regCom(Model model,Comp_inf comp,HttpSession session,HttpServletRequest request) throws IllegalStateException, IOException{		
		//세션에서 회원아이디 값을 가져옴 
		System.out.println(comp);
		String msg = "";
		try {
		Mmbr_inf Mmbr= (Mmbr_inf) session.getAttribute("user");
		System.out.println(Mmbr);
		
		int result = service.ComInsert(comp,Mmbr,request);
			if(result>0) {
				msg ="정상적으로 입력되었습니다";
			}
			
		}catch(NullPointerException e){
			msg = "다시입력해주세요";
		}finally {
			model.addAttribute("msg",msg);
		}
		
		return "phonebook/main";
	}
	
}
