package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.Board_Photo;
import com.bit.phone.service.BoardService;

@Controller

public class BoardPhotoTagController {
	@Autowired
	BoardService service;
	@RequestMapping("/board/boardPhtoTagForm")
	public String BoardphotoTagForm(Model model,@RequestParam("board_idx")String board_idx) {

		
		String view = "phonebook/main";
		String page ="";
		Board_Photo photo = service.phototagselect(board_idx);	
		
		if(photo !=null) {
			page = "../board/boardPhotoTagForm.jsp";
			model.addAttribute("page",page);
			model.addAttribute("photo",photo);
			model.addAttribute("board_idx",board_idx);
		}else {
			model.addAttribute("page",page);
			model.addAttribute("photo",photo);
		}
		
		return view;
	}
	
	

	
}
