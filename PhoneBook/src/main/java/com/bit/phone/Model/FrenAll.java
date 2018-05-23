package com.bit.phone.Model;

import org.springframework.web.multipart.MultipartFile;

public class FrenAll {
	private int fren_nmbr;
	private String fren_nm;
	private String fren_phn_nmbr;
	private String fren_email;
	private String fren_addr;
	private String fren_photo;
	private MultipartFile filename;
	private int mmbr_nmbr;
	private int id;
	private int id2;
	private int comp_nmbr;//회사친구 번호 
	private String comp_nm; // 회사친구 이름 
	private int univ_numbr;
	private String maj;
	private String grd;
	private int rownum;
	public FrenAll() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FrenAll(int fren_nmbr, String fren_nm, String fren_phn_nmbr, String fren_email, String fren_addr,
			String fren_photo, MultipartFile filename, int mmbr_nmbr, int id, int id2, int comp_nmbr, String comp_nm,
			int univ_numbr, String maj, String grd, int rownum) {
		super();
		this.fren_nmbr = fren_nmbr;
		this.fren_nm = fren_nm;
		this.fren_phn_nmbr = fren_phn_nmbr;
		this.fren_email = fren_email;
		this.fren_addr = fren_addr;
		this.fren_photo = fren_photo;
		this.filename = filename;
		this.mmbr_nmbr = mmbr_nmbr;
		this.id = id;
		this.id2 = id2;
		this.comp_nmbr = comp_nmbr;
		this.comp_nm = comp_nm;
		this.univ_numbr = univ_numbr;
		this.maj = maj;
		this.grd = grd;
		this.rownum = rownum;
	}


	public int getRowNum() {
		return rownum;
	}
	public void setRowNum(int rowNum) {
		this.rownum = rowNum;
	}
	public int getFren_nmbr() {
		return fren_nmbr;
	}
	public void setFren_nmbr(int fren_nmbr) {
		this.fren_nmbr = fren_nmbr;
	}
	public String getFren_nm() {
		return fren_nm;
	}
	public void setFren_nm(String fren_nm) {
		this.fren_nm = fren_nm;
	}
	public String getFren_phn_nmbr() {
		return fren_phn_nmbr;
	}
	public void setFren_phn_nmbr(String fren_phn_nmbr) {
		this.fren_phn_nmbr = fren_phn_nmbr;
	}
	public String getFren_email() {
		return fren_email;
	}
	public void setFren_email(String fren_email) {
		this.fren_email = fren_email;
	}
	public String getFren_addr() {
		return fren_addr;
	}
	public void setFren_addr(String fren_addr) {
		this.fren_addr = fren_addr;
	}
	public String getFren_photo() {
		return fren_photo;
	}
	public void setFren_photo(String fren_photo) {
		this.fren_photo = fren_photo;
	}
	public MultipartFile getFilename() {
		return filename;
	}
	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}
	public int getMmbr_nmbr() {
		return mmbr_nmbr;
	}
	public void setMmbr_nmbr(int mmbr_nmbr) {
		this.mmbr_nmbr = mmbr_nmbr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public int getComp_nmbr() {
		return comp_nmbr;
	}
	public void setComp_nmbr(int comp_nmbr) {
		this.comp_nmbr = comp_nmbr;
	}
	public String getComp_nm() {
		return comp_nm;
	}
	public void setComp_nm(String comp_nm) {
		this.comp_nm = comp_nm;
	}
	public int getUniv_numbr() {
		return univ_numbr;
	}
	public void setUniv_numbr(int univ_numbr) {
		this.univ_numbr = univ_numbr;
	}
	public String getMaj() {
		return maj;
	}
	public void setMaj(String maj) {
		this.maj = maj;
	}
	public String getGrd() {
		return grd;
	}
	public void setGrd(String grd) {
		this.grd = grd;
	}


	@Override
	public String toString() {
		return "FrenAll [fren_nmbr=" + fren_nmbr + ", fren_nm=" + fren_nm + ", fren_phn_nmbr=" + fren_phn_nmbr
				+ ", fren_email=" + fren_email + ", fren_addr=" + fren_addr + ", fren_photo=" + fren_photo
				+ ", filename=" + filename + ", mmbr_nmbr=" + mmbr_nmbr + ", id=" + id + ", id2=" + id2 + ", comp_nmbr="
				+ comp_nmbr + ", comp_nm=" + comp_nm + ", univ_numbr=" + univ_numbr + ", maj=" + maj + ", grd=" + grd
				+ ", rowNum=" + rownum + "]";
	}
	
	
}
