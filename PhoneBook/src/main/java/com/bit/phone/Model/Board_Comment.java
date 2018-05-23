package com.bit.phone.Model;

import java.util.Date;

public class Board_Comment {

	private int board_comment_idx;
	private String board_comment_contents;
	private Date board_comment_regdate;
	private int member_idx;
	private int board_idx;
	
	
	public Board_Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board_Comment(int board_comment_idx, String board_comment_contents, Date board_comment_regdate,
			int member_idx, int board_idx) {
		super();
		this.board_comment_idx = board_comment_idx;
		this.board_comment_contents = board_comment_contents;
		this.board_comment_regdate = board_comment_regdate;
		this.member_idx = member_idx;
		this.board_idx = board_idx;
	}
	
	

	@Override
	public String toString() {
		return "Board_Comment [board_comment_idx=" + board_comment_idx + ", board_comment_contents="
				+ board_comment_contents + ", board_comment_regdate=" + board_comment_regdate + ", member_idx="
				+ member_idx + ", board_idx=" + board_idx + "]";
	}
	public int getBoard_comment_idx() {
		return board_comment_idx;
	}
	public void setBoard_comment_idx(int board_comment_idx) {
		this.board_comment_idx = board_comment_idx;
	}
	public String getBoard_comment_contents() {
		return board_comment_contents;
	}
	public void setBoard_comment_contents(String board_comment_contents) {
		this.board_comment_contents = board_comment_contents;
	}
	public Date getBoard_comment_regdate() {
		return board_comment_regdate;
	}
	public void setBoard_comment_regdate(Date board_comment_regdate) {
		this.board_comment_regdate = board_comment_regdate;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public int getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	
	
}
