package com.bit.phone.Model;

import java.util.Date;

public class GuestList {

	int idx;
	int rownum;
	String listTitle;
	String listText;
	Date regdate;
	int listcount;



	public GuestList(int idx, int rownum, String listTitle, String listText, Date regdate, int listcount) {
		super();
		this.idx = idx;
		this.rownum = rownum;
		this.listTitle = listTitle;
		this.listText = listText;
		this.regdate = regdate;
		this.listcount = listcount;
	}

	public GuestList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getListTitle() {
		return listTitle;
	}

	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}

	public String getListText() {
		return listText;
	}

	public void setListText(String listText) {
		this.listText = listText;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getListcount() {
		return listcount;
	}

	public void setListcount(int listcount) {
		this.listcount = listcount;
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	@Override
	public String toString() {
		return "GuestList [idx=" + idx + ", listTitle=" + listTitle + ", listText=" + listText + ", regdate=" + regdate
				+ ", listcount=" + listcount + "]";
	}

}
