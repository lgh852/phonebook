package com.bit.phone.Model;

public class ViewPageModel {

	private int rowNum;//rowNUm
	private int rowNumCnt;//전체
	
	private int pageCnt; // 페이지 번호 담을
	private int Cnt;
	private int minNum;//min limt num 
	private int maxNum;//max limt num
	private int Totalcnt;//전체 페이지수 
	private int maxPage;
	private int minPage;
	private int totalpage;//표시할수 있는 전체 페이지
	private int pageViewNum;//표시할 페이지 번호 숫자를 담은
	private int upNum;//앞으로 
	private int downNum;//페이지 번호 다운 
	private int nowPage;

	public ViewPageModel(int rowNum, int rowNumCnt, int pageCnt, int cnt, int minNum, int maxNum, int totalcnt,
			int maxPage, int minPage, int totalpage, int pageViewNum, int upNum, int downNum, int nowPage) {
		super();
		this.rowNum = rowNum;
		this.rowNumCnt = rowNumCnt;
		this.pageCnt = pageCnt;
		Cnt = cnt;
		this.minNum = minNum;
		this.maxNum = maxNum;
		Totalcnt = totalcnt;
		this.maxPage = maxPage;
		this.minPage = minPage;
		this.totalpage = totalpage;
		this.pageViewNum = pageViewNum;
		this.upNum = upNum;
		this.downNum = downNum;
		this.nowPage = nowPage;
	}
	public ViewPageModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getRowNumCnt() {
		return rowNumCnt;
	}
	public void setRowNumCnt(int rowNumCnt) {
		this.rowNumCnt = rowNumCnt;
	}
	public int getPageCnt() {
		return pageCnt;
	}
	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}
	public int getCnt() {
		return Cnt;
	}
	public void setCnt(int cnt) {
		Cnt = cnt;
	}
	public int getMinNum() {
		return minNum;
	}
	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getTotalcnt() {
		return Totalcnt;
	}
	public void setTotalcnt(int totalcnt) {
		Totalcnt = totalcnt;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getMinPage() {
		return minPage;
	}
	public void setMinPage(int minPage) {
		this.minPage = minPage;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getPageViewNum() {
		return pageViewNum;
	}
	public void setPageViewNum(int pageViewNum) {
		this.pageViewNum = pageViewNum;
	}
	public int getUpNum() {
		return upNum;
	}
	public void setUpNum(int upNum) {
		this.upNum = upNum;
	}
	public int getDownNum() {
		return downNum;
	}
	public void setDownNum(int downNum) {
		this.downNum = downNum;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
		
}