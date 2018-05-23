package com.bit.phone.dao;

import java.util.List;

import com.bit.phone.Model.GuestList;


public interface GuestDao {

	public int insertText(GuestList guestList);

	public List<GuestList> selectView();
	
	public int countInsert();
	
	public int listUpdate(GuestList guestList);
	
	public GuestList selectByIdx(String listTitle);
	
	public int guestdelete(String idx);
	
	//카운트 증가 
	public int countUp(int listcount,String idx);
	
	public int CountAll();
	
	public List<GuestList> RowNum();
	
	
	

}
