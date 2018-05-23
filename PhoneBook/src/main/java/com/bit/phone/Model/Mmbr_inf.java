package com.bit.phone.Model;


import org.springframework.web.multipart.MultipartFile;

public class Mmbr_inf {

	private int mmbr_nmbr;
	private String mmbr_id;
	private String mmbr_password;
	private String mmbr_email;
	private String mmbr_nm;
	private String mmbr_photo;
	private MultipartFile filename;
	public Mmbr_inf(int mmbr_nmbr, String mmbr_id, String mmbr_password, String mmbr_email, String mmbr_nm,
			String mmbr_photo, MultipartFile filename) {
		super();
		this.mmbr_nmbr = mmbr_nmbr;
		this.mmbr_id = mmbr_id;
		this.mmbr_password = mmbr_password;
		this.mmbr_email = mmbr_email;
		this.mmbr_nm = mmbr_nm;
		this.mmbr_photo = mmbr_photo;
		this.filename = filename;
	}
	public Mmbr_inf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMmbr_nmbr() {
		return mmbr_nmbr;
	}
	public void setMmbr_nmbr(int mmbr_nmbr) {
		this.mmbr_nmbr = mmbr_nmbr;
	}
	public String getMmbr_id() {
		return mmbr_id;
	}
	public void setMmbr_id(String mmbr_id) {
		this.mmbr_id = mmbr_id;
	}
	public String getMmbr_password() {
		return mmbr_password;
	}
	public void setMmbr_password(String mmbr_password) {
		this.mmbr_password = mmbr_password;
	}
	public String getMmbr_email() {
		return mmbr_email;
	}
	public void setMmbr_email(String mmbr_email) {
		this.mmbr_email = mmbr_email;
	}
	public String getMmbr_nm() {
		return mmbr_nm;
	}
	public void setMmbr_nm(String mmbr_nm) {
		this.mmbr_nm = mmbr_nm;
	}
	public String getMmbr_photo() {
		return mmbr_photo;
	}
	public void setMmbr_photo(String mmbr_photo) {
		this.mmbr_photo = mmbr_photo;
	}
	public MultipartFile getFilename() {
		return filename;
	}
	public void setFilename(MultipartFile filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "Mmbr_inf [mmbr_nmbr=" + mmbr_nmbr + ", mmbr_id=" + mmbr_id + ", mmbr_password=" + mmbr_password
				+ ", mmbr_email=" + mmbr_email + ", mmbr_nm=" + mmbr_nm + ", mmbr_photo=" + mmbr_photo + ", filename="
				+ filename + "]";
	}

	
	
}
