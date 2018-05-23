package com.bit.phone.service;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bit.phone.Model.Board;
import com.bit.phone.Model.Board_Photo;
import com.bit.phone.Model.Category_Room;
import com.bit.phone.Model.Category_Space;
import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.Model.Url_Tag;
import com.bit.phone.dao.BoarDao;



public class BoardService {

	BoarDao dao;

	@Autowired
	SqlSessionTemplate sessionTemplate;

	@Autowired
	BoardPhotoUpLoad photoup;

	public int insertroom(Category_Room room) {
		dao = sessionTemplate.getMapper(BoarDao.class);
		int resultCnt = dao.roomisnert(room);
		if (resultCnt < 0) {
			resultCnt = -1;
		}

		return resultCnt;
	}

	public int insertspace(Category_Space space) {
		dao = sessionTemplate.getMapper(BoarDao.class);
		int resultCnt = dao.spaceisnert(space);
		if (resultCnt < 0) {
			resultCnt = -1;
		}
		return resultCnt;
	}

	// 파일이름 저장하는 디비 실행 하는 메서드
	public int insertPhotoName(Board_Photo photo) {
		dao = sessionTemplate.getMapper(BoarDao.class);
		int resultCnt = dao.photoinsert(photo);
		if (resultCnt < 0) {
			resultCnt = -1;
		}
		return resultCnt;
	}

	public int Boardinsert(Board board) {
		dao = sessionTemplate.getMapper(BoarDao.class);
		int resultCnt = dao.Boardinsert(board);
		if (resultCnt < 0) {
			resultCnt = -1;
		}

		return resultCnt;

	}

	public int BoardAllService(HttpServletRequest request, Board_Photo photo, Category_Room room, Category_Space space,
			Board board, HttpSession session) throws IllegalStateException, IOException {
		int result = 0;
		// 사진업로드
		if (room.getCategory_room()!=null) {
			int resultroom = insertroom(room);
			// idx 가져와서 넣어줌 key 값으로
			board.setCategory_idx(room.getCategory_idx());
		}
		

		if (space.getCategory_space() != null) {
			int resultspace = insertspace(space);
			// idx 가져와서 넣어줌 key 값으로
			board.setCategory_idx2(space.getCategory_idx());
		}
		// 게시글 업데이트

		Mmbr_inf member = (Mmbr_inf) session.getAttribute("user");		
		if (member != null) {
			board.setMember_idx(member.getMmbr_nmbr());

		}
		if (board != null) {
			
			result = Boardinsert(board);
			photo.setBoard_idx(board.getBoard_idx());
			
		}else {
			result = -1;
		}
		

		
		if (photo != null) {
			photo.setBoard_idx(board.getBoard_idx());
			// 사진업로드
			photoup.fileupload(request, session, photo);
			result = insertPhotoName(photo);

		}else {
			result = -1;
		}
		
		return result;
		
	}

	public 	List<Board_Photo> photoSelect(Board board) {
		int board_idx = board.getBoard_idx();
		dao = sessionTemplate.getMapper(BoarDao.class);
		List<Board_Photo> listPhoto = dao.photoselect(board_idx);
		if(listPhoto != null) {
		
		}else {
			listPhoto = null;
		}
		
		return listPhoto;
	}
	public Board_Photo phototagselect(String board_idx) {
		
		dao = sessionTemplate.getMapper(BoarDao.class);
		
		Board_Photo photo = dao.photoTagformselect(board_idx);
		
		if(photo!=null) {
			
		}else {
			photo = null;
		}
		
		
		
		 
		return photo;
				
	}

	public int taginsert(Url_Tag tag) {
		
		dao = sessionTemplate.getMapper(BoarDao.class);
		int count = dao.tagnocount(tag);
		int idx;
		if(count>=0&&count<5) {
		
			int result = dao.taginsert(tag);
			idx = tag.getTag_idx();

			if(result<0) {
				idx = 55;
			}

		}else {
			//no가 5개 이상일경우 더이상 행성할수 없다는 태그 
			idx = 55;
		}
		
				
		return idx;
	}

	public String selectTagInfo(Url_Tag tag) {
		dao = sessionTemplate.getMapper(BoarDao.class);
		String tag_url =  dao.selectTagInfo(tag);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);

		System.out.println("확인!!!"+tag_url);
		System.out.println("확인!!!"+tag_url);
		
		
		if (tag_url!=null) {
			return tag_url;
		}else {
			tag_url = "null";
		}
		return tag_url;
	}

	public String deletetag(Url_Tag tag) {
	
		dao = sessionTemplate.getMapper(BoarDao.class);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		System.out.println("이승기"+tag);
		
		int resultcnt = dao.tagdelete(tag);
		String check ="";
		
		if(resultcnt>0) {
			//성공
		check = "y";
		}else {
			//실패
			check="n";
		}
		
		return check;
	}

}
