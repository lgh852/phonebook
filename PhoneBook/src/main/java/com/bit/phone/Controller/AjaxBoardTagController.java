package com.bit.phone.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.phone.Model.Url_Tag;
import com.bit.phone.service.BoardService;


@Controller
public class AjaxBoardTagController {
	@Autowired
	BoardService service;

	@RequestMapping("/board/boardAjaxTag")
	@ResponseBody
	public String BoardphotoTag(Url_Tag tag,Model model) {

		int idxs = service.taginsert(tag);
		String idx=String.valueOf(idxs);
		model.addAttribute("idx",idx);
		return idx;
	}

}
