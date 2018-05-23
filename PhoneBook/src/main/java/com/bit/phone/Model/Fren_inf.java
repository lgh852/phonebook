package com.bit.phone.Model;

import org.springframework.web.multipart.MultipartFile;

public class Fren_inf {

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
	public Fren_inf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fren_inf(int fren_nmbr, String fren_nm, String fren_phn_nmbr, String fren_email, String fren_addr,
			String fren_photo, MultipartFile filename, int mmbr_nmbr, int id, int id2) {
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
	}
	@Override
	public String toString() {
		return "Fren_inf [fren_nmbr=" + fren_nmbr + ", fren_nm=" + fren_nm + ", fren_phn_nmbr=" + fren_phn_nmbr
				+ ", fren_email=" + fren_email + ", fren_addr=" + fren_addr + ", fren_photo=" + fren_photo
				+ ", filename=" + filename + ", mmbr_nmbr=" + mmbr_nmbr + ", id=" + id + ", id2=" + id2 + "]";
	}
	
}
