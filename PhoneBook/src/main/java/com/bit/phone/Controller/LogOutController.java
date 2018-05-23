package com.bit.phone.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogOutController {

   @RequestMapping("/loginck/logout")
   public String LogOut(HttpSession session,Model model) {
      
         if(session!=null) {
            //세션삭제
        	 session.invalidate();
        	 model.addAttribute("msg","로그아웃 처리 되었습니다");
             
         }
        
      return "phonebook/main";
      
   }
}