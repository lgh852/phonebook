package com.bit.phone.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.service.FriendService;

@Controller
public class FrenDeleteController {

	@Autowired
	FriendService service;
	
	@RequestMapping("/phonebook/FrenDelete")
	public String delete(@RequestParam("fren_nmbr")String fren_nmbr,HttpSession session,Model model,
			HttpServletRequest request) {
		String page = "";
		Mmbr_inf mmbr = (Mmbr_inf) session.getAttribute("user");
		//세션값 비교 
		
		if(mmbr!=null) {
		
		int nmbr = mmbr.getMmbr_nmbr();
		System.out.println("넘어오는값 확인");
		
		int result = service.FrenDelete(fren_nmbr,nmbr);
		if(result>0) {
			//정상적으로 실행되었으면 바로 전페이지로 리다이렉트
			
			page ="redirect:/loginck/ListView";
		}else {
			String msg = "삭제 실패";
			System.out.println("삭제 실패");
			model.addAttribute("msg",msg);
		}
			
			
		}
		
		return page;
	}
	
}
