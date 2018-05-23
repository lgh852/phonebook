package com.bit.phone.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bit.phone.Model.Comp_inf;
import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.Fren_inf;
import com.bit.phone.Model.Mmbr_inf;
import com.bit.phone.Model.Univ_inf;
import com.bit.phone.dao.MemberDao;

public class FriendService {

	MemberDao dao;
	@Autowired
	SqlSessionTemplate sessionTemplate;
	@Autowired
	PhotoFren photo;
	public int ComInsert(Comp_inf comp, Mmbr_inf Mmbr,HttpServletRequest request) throws IllegalStateException, IOException {

		comp.setMmbr_nmbr(Mmbr.getMmbr_nmbr());
		dao = sessionTemplate.getMapper(MemberDao.class);
		// 회사 쿼리 실행

		int resultCnt = dao.InsertComReg(comp);
		comp.setComp_nmbr(comp.getComp_nmbr());
		
		photo.fileload(request,comp);
		// 전체 쿼리 실행
		if (resultCnt > 0) {
			// 1번째 쿼리 실행 결과 값 있으면
			dao.InsertComfren(comp);
			

		}

		return resultCnt;
	}

	public int UnivInsert(Univ_inf univ_inf, Mmbr_inf Mmbr,HttpServletRequest request) throws IllegalStateException, IOException {
		dao = sessionTemplate.getMapper(MemberDao.class);

		univ_inf.setMmbr_nmbr(Mmbr.getMmbr_nmbr());
		
		int result = dao.InsertUnivReg(univ_inf);

		System.out.println(univ_inf.getMmbr_nmbr());

		univ_inf.setUniv_numbr(univ_inf.getUniv_numbr());
		
		System.out.println(univ_inf.getUniv_numbr());
		photo.fileload(request,univ_inf);
		int resultCnt = -1;
		if (result > 0) {
			resultCnt = dao.InsertUnivfren(univ_inf);
			if (resultCnt > 0) {

				return resultCnt;
			}
		}

		return result;
	}

	public List<FrenAll> selectFrenList() {
		dao = sessionTemplate.getMapper(MemberDao.class);
		List<FrenAll> fren =  dao.ListFrenSelect();
	
		return fren;
	}
	
	
	public FrenAll selectView(String fren_nmbr) {
		
	dao = sessionTemplate.getMapper(MemberDao.class);
	//정보 담을곳 
	FrenAll fren = dao.selectView(fren_nmbr);
	
	return fren;
	}

	public int FrenDelete(String fren_nmbr, int nmbr) {
		int result=0;
		dao = sessionTemplate.getMapper(MemberDao.class);
		//작정자 비교를 위해 select문 
		FrenAll frenAll =dao.selectView(fren_nmbr);
		int comp_nmbr = frenAll.getId2();
		int univ_numbr = frenAll.getId();
		int seletenmbr = frenAll.getMmbr_nmbr();
		if(seletenmbr==nmbr) {
			System.out.println(univ_numbr);
			if(univ_numbr>comp_nmbr) {
				result=dao.frenDelete(fren_nmbr);
				dao.deleteUni(univ_numbr);
				System.out.println(univ_numbr);
				System.out.println("학교친구 삭제 ");
			}else {
				result=dao.frenDelete(fren_nmbr);
				dao.deleteCom(comp_nmbr);
				System.out.println("회사친구 삭제");
			}
			//작성자와 글쓴이가 같으면
			
		}
		return result;
	}

	public int frenUpdate(FrenAll all,HttpServletRequest request) throws IllegalStateException, IOException {
		dao = sessionTemplate.getMapper(MemberDao.class);
		//select문
		Fren_inf mmbr = new Fren_inf();
		mmbr.setFren_nm(all.getFren_nm());
		mmbr.setFilename(all.getFilename());
		mmbr.setFren_photo(all.getFren_photo());
		
		photo.fileload(request, mmbr);
		System.out.println(mmbr.getFren_photo());
		all.setFren_photo(mmbr.getFren_photo());
		
		int result = dao.frenUpdate(all);
		
		if(result<0) {
			result = -1;
		}
		return result;
	}

	public int comUpdate(FrenAll all) {
		dao = sessionTemplate.getMapper(MemberDao.class);
		
		int result = dao.comUpdate(all);
		if(result<0) {
			result = -1;
		}
		
		return result;
	}
	
	public int univUpdate(FrenAll all) {
		dao = sessionTemplate.getMapper(MemberDao.class);
		
		int result = dao.univUpdate(all);
		if(result<0) {
			result = -1;
		}
		
		return result;
	}
	


}
