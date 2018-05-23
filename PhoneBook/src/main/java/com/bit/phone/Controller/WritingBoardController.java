package com.bit.phone.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.phone.Model.Board;
import com.bit.phone.Model.Board_Photo;
import com.bit.phone.Model.Category_Room;
import com.bit.phone.Model.Category_Space;
import com.bit.phone.service.BoardService;

@Controller
public class WritingBoardController {

	@Autowired
	BoardService serviec;
	@Autowired
	Category_Room room;
	@Autowired
	Category_Space space;

	@RequestMapping(value = "/board/boardFrom", method = RequestMethod.GET)
	public String WritingPhotoForm(Model model) {

		String view = "/phonebook/main";
		String page = "../board/boardFrom.jsp";

		model.addAttribute("page", page);

		return view;
	}

	@RequestMapping(value = "/board/boardFrom", method = RequestMethod.POST)
	public String bo(Model model, @RequestParam(value = "category_room", defaultValue = "null") String category_room,
			Board board, @RequestParam(value = "category_space", defaultValue = "null") String category_space,
			Board_Photo photo, HttpServletRequest request, HttpSession session)
			throws IllegalStateException, IOException {
		// 받은값들 넣어주기

		String page = "";
		String msg = "";
		String view = "";
		space.setCategory_space(category_space);
		room.setCategory_room(category_room);
		int resultCnt = serviec.BoardAllService(request, photo, room, space, board, session);

		if (resultCnt > 0) {
			// 성공
			page = "../board/boardPhotoPage.jsp";
			view = "/phonebook/main";
			model.addAttribute("page", page);

			// 사진을 보여눌 select 문
			board.getBoard_idx();
			List<Board_Photo> listPhoto = serviec.photoSelect(board);
			// 사진 정보 전달
			model.addAttribute("listPhoto",listPhoto);
		} else {
			// 예외상황
			page = "../board/PhotoUpException.jsp";
			msg = "다른 어떤상황";
			view = "home";
			model.addAttribute("msg", msg);
			model.addAttribute("page", page);

		}

		return view;
	}

}
