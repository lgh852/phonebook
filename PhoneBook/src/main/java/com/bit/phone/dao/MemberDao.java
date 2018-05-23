package com.bit.phone.dao;


import java.util.List;

import com.bit.phone.Model.Comp_inf;
import com.bit.phone.Model.FrenAll;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.Model.Univ_inf;
import com.bit.phone.Model.ViewPageModel;

public interface MemberDao {

	public int insertMember(Mmbr_inf member);

	public Mmbr_inf selectById(String member_id);
	
	public int InsertComReg(Comp_inf comp_inf);

	public int InsertComfren(Comp_inf comp_inf);
	
	public int InsertUnivReg(Univ_inf univ_inf);
	
	public int InsertUnivfren(Univ_inf univ_inf);

	public List<FrenAll> ListFrenSelect();
	
	public FrenAll selectView(String fren_nmbr);

	public int frenDelete(String fren_nmbr);
	
	public int frenUpdate(FrenAll all);
	
	public int comUpdate(FrenAll all);

	public int univUpdate(FrenAll all);
	
	public ViewPageModel totalNum(); 
	
	public int deleteUni(int univ_numbr);
	
	public int deleteCom(int comp_nmbr);

	public List<FrenAll> selectpage(ViewPageModel page);
	
}
