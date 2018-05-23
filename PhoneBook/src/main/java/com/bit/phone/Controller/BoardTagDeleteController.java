package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.phone.Model.Url_Tag;
import com.bit.phone.service.BoardService;

@Controller
public class BoardTagDeleteController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/board/tagdelete")
	@ResponseBody
	public String tagdelete(Url_Tag tag) {
		
		String check = service.deletetag(tag);
		
		
		
		return check;
	}
}
