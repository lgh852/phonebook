package com.bit.phone.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.phone.Model.GuestList;
import com.bit.phone.service.GuestListService;

@Controller
@RequestMapping("/loginck/boardlist")
public class BoardListController {

	@Autowired
	GuestListService listService;

	@RequestMapping(method = RequestMethod.GET)
	public String listview(Model model) {

		String page = "";
		List<GuestList> list =listService.ListView();
		String view = "phonebook/main";
			int countAll = listService.rowcount();
			List<GuestList> rownum =listService.RowNum();
			
			System.out.println(countAll);
		if(list !=null) {
			page = "../loginck/boardList.jsp";
			model.addAttribute("countAll",countAll);
			model.addAttribute("list",list);			
			model.addAttribute("rownum", rownum);
			model.addAttribute("page",page);
			
		}else {
			list= null;
		}
		
		
		return view;
	
	}
}
