package com.bit.phone.dao;

import java.util.List;

import com.bit.phone.Model.Board;
import com.bit.phone.Model.Board_Photo;
import com.bit.phone.Model.Category_Room;
import com.bit.phone.Model.Category_Space;
import com.bit.phone.Model.Url_Tag;


public interface BoarDao {

	public int spaceisnert(Category_Space space);

	public int roomisnert(Category_Room room);

	public int photoinsert(Board_Photo photo);
	
	public int Boardinsert(Board board);

	public List<Board_Photo>photoselect(int board_idx); 

	public Board_Photo photoTagformselect(String board_idx); 

	public int taginsert(Url_Tag tag);
	
	public int tagnocount(Url_Tag tag);
	
	public String selectTagInfo(Url_Tag tag);
	
	public int tagdelete(Url_Tag tag);
}
