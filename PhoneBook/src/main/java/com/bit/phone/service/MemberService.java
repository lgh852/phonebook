package com.bit.phone.service;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.dao.MemberDao;

public class MemberService {

	MemberDao dao;

	@Autowired
	PhotoUpLoad upload;

	@Autowired
	SqlSessionTemplate sessionTemplate;

	public int insertMember(Mmbr_inf mmbr, HttpServletRequest request) throws IllegalStateException, IOException {
		
		upload.fileload(request, mmbr);
		
		dao = sessionTemplate.getMapper(MemberDao.class);
		
		int result = dao.insertMember(mmbr);
		
			return result;
			
	}

	public Mmbr_inf selectByid(String member_id,String password){

		dao = sessionTemplate.getMapper(MemberDao.class);
		
		Mmbr_inf mmbr = dao.selectById(member_id);
		
		 //비밀번호 체크
		if (mmbr != null && mmbr.getMmbr_password().equals(password)) {
			//비밀번호 지우기 
			//정상 로그인
			mmbr.setMmbr_password(password);
				
		}else {
			
			
		}

		return mmbr;
	}

}
