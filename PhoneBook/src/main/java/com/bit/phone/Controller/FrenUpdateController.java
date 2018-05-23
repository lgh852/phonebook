package com.bit.phone.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.service.FriendService;

@Controller
public class FrenUpdateController {
	
	@Autowired
	FriendService service;
	
	@RequestMapping(value = "/phonebook/frenUpdateForm", method = RequestMethod.GET)
	public String frenUpdateForm(@RequestParam("fren_nmbr") String fren_nmbr, Model model, HttpSession session,
			HttpServletRequest request) {
		// 세션값 체크
		String msg = "";
		String page ="../loginck/frenUpdateForm.jsp";
		System.out.println(page);
		Mmbr_inf mmbr = (Mmbr_inf) session.getAttribute("user");
		// 넘어오는값 확인
		System.out.println(fren_nmbr);

		// 회원번호
		int uesrnmbr = mmbr.getMmbr_nmbr();

		if (mmbr != null) {
			// 친구 번호로 값 가져옴
			FrenAll all = service.selectView(fren_nmbr);
			
			System.out.println(all);
			// 글쓴이 회원번호
			int savenmbr = all.getMmbr_nmbr();
				
			if (uesrnmbr == savenmbr) {
				model.addAttribute("all", all);
				model.addAttribute("page",page);
				return "phonebook/main";
			
			} else {
				
				msg = "로그인후 이용부탁드립니다 ";
				model.addAttribute("msg", msg);
				return "phonebook/main";
			}
		
		} else {
			msg = "로그인후 이용부탁드립니다 ";

			model.addAttribute("msg", msg);
			
		}

		//return "loginck/frenUpdateForm";
		return "phonebook/main";

	}
		
	@RequestMapping(value="/phonebook/frenUpdateForm", method=RequestMethod.POST)
	public String FrenUpdate(FrenAll all,Model model,HttpServletRequest request) throws IllegalStateException, IOException {
		//요청 
		
		String page= null;
		//공통정보 업데이트
		System.out.println(all);
		String msg;
		
		
		int result = service.frenUpdate(all,request);
		//학교 회사 구분 
		if(result>0) {
			
			int resultCnt;
			System.out.println("공통"+ result);
		if(all.getComp_nm()!=null) {
			//회사 
			//넘어온정보로 학교 id 회사 id 조회
			
			resultCnt = service.comUpdate(all);
			System.out.println("회사"+resultCnt);
			if(resultCnt>0) {
				page ="redirect:/loginck/ListView";
				
			}else {
				page ="../phonebook/Exception";
				msg = "정상적으로 처리되지 않았습니다";
				model.addAttribute("msg",msg);

			}
		}else {
			//학교
			resultCnt = service.univUpdate(all);
			if(resultCnt>0) {
				page ="redirect:/loginck/ListView";
			}else {
				page ="../phonebook/Exception";
				msg = "정상적으로 처리되지 않았습니다";
				model.addAttribute("msg",msg);
			}
		}
			
		}
	
		return page;
	}

}
