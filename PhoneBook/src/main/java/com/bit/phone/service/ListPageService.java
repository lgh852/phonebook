package com.bit.phone.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bit.phone.Model.FrenAll;
import com.bit.phone.Model.ViewPageModel;
import com.bit.phone.dao.MemberDao;

public class ListPageService {

	MemberDao dao;
	@Autowired
	SqlSessionTemplate sessionTemplate;

	public ViewPageModel totalCnt(ViewPageModel pagemodel,String nowPage) {
		
		dao = sessionTemplate.getMapper(MemberDao.class);
		 pagemodel = dao.totalNum();
		 //현재 페이지 번호 rowpage
		int rowpage = Integer.parseInt(nowPage);
		
		if(pagemodel != null) {
			
			int pageCnt = pagemodel.getTotalcnt();
			int totalpage = (pageCnt/10)+1;
		/*		//요청페이지가 잇을경우  거기까지 + 해줄 if문
			if()
		*/	int minpage = 1;
			if(rowpage>minpage) {
				/*rowpage 가 minpage 페이지보다 클경우 최소값을 교체 */
				minpage = rowpage;
			
				
			}
			
			pagemodel.setNowPage(rowpage);
			pagemodel.setMinPage(minpage);
			pagemodel.setTotalpage(totalpage);
				
			if(totalpage>minpage+4) {
				pagemodel.setMaxPage(minpage+4);
			}else {
				
				pagemodel.setMaxPage(totalpage);
				//5보다 작다면 전체 페이지수 표시
			}
	
		}
		return pagemodel;
	}

	public List<FrenAll> selectpageNum(String pageCnt,ViewPageModel pagemodel) {
			//값 비교를 위해 형변환 
		int pageCntnum = Integer.parseInt(pageCnt);
		//현재 페이지의 값 
	
		dao= sessionTemplate.getMapper(MemberDao.class);
		//limt 할 max값 min값 
		int minNum = ((pageCntnum-1)*10);
		//쿼리를 가져올개수 10개 로 고정
		int maxNum = 10;
		
		pagemodel.setMaxNum(maxNum);
		pagemodel.setMinNum(minNum);
		List<FrenAll> frenlist =dao.selectpage(pagemodel);
		for (FrenAll frenAll : frenlist) {
			int row = frenAll.getRowNum();
			row=row+(minNum);
			frenAll.setRowNum(row);
		}
		
		return frenlist;
	}

	//현재 페이지수 증가값 부여 
	public String pageCntUp(String pageCnt) {
		int Cnt = Integer.parseInt(pageCnt);
			Cnt+=1;
			
			pageCnt = String.valueOf(Cnt);
		
		return pageCnt;
	}

}
