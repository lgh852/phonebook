package com.bit.phone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.phone.Model.Url_Tag;
import com.bit.phone.service.BoardService;

@Controller
public class BoardTagInfoController {
	@Autowired
	BoardService service;
		
	@RequestMapping("/board/taginfo")
	@ResponseBody
	public String taginfo(Url_Tag tag) {
		
		String url_tag = service.selectTagInfo(tag);
		
		
		return url_tag;
	}
}
