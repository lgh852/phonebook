package com.bit.phone.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bit.phone.Model.GuestList;
import com.bit.phone.dao.GuestDao;


public class GuestListService {

	@Autowired
	SqlSessionTemplate sessionTemplate;

	GuestDao dao;

	public int GuestListInsert(GuestList guestList) {
		dao = sessionTemplate.getMapper(GuestDao.class);
		int resultCnt = dao.insertText(guestList);
		if (resultCnt > 0) {
			System.out.println("insert실행");

		} else {
			resultCnt = -1;
		}

		return resultCnt;
	}

	public List<GuestList> ListView() {
		dao = sessionTemplate.getMapper(GuestDao.class);
		List<GuestList> list = dao.selectView();
		
		return list;

	}

	public int listUpdate(GuestList guestlist) {
		dao = sessionTemplate.getMapper(GuestDao.class);
		int resultCnt = dao.listUpdate(guestlist);
		System.out.println("확이");
		System.out.println(guestlist);

		return resultCnt;

	}

	public GuestList selectByIdx(String idx) {
		dao = sessionTemplate.getMapper(GuestDao.class);
		GuestList guestList = dao.selectByIdx(idx);
		System.out.println("서비스 확인!!!!!!!!");
		return guestList;
	}

	public int guestListDelete(String idx) {

		dao = sessionTemplate.getMapper(GuestDao.class);
		int resultCnt = dao.guestdelete(idx);
		if (resultCnt > 0) {

		}
		return resultCnt;
	}

	public int listCount(int listcount, String idx) {
		dao = sessionTemplate.getMapper(GuestDao.class);
		System.out.println("확인");
		System.out.println(listcount);
		System.out.println(idx);
		int resultCnt = dao.countUp(listcount, idx);
		
		return resultCnt;

	}
	public int rowcount() {
		dao = sessionTemplate.getMapper(GuestDao.class);
		int count = dao.CountAll();
		return count;
		
	}
	public List<GuestList> RowNum() {
		dao = sessionTemplate.getMapper(GuestDao.class);
		List<GuestList> rownum=dao.RowNum();
		
		return rownum;
	}
	

		
		
	
}
