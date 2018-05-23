package com.bit.phone.Model;

import org.springframework.web.multipart.MultipartFile;

public class Univ_inf extends Fren_inf {
	private int univ_numbr;
	private String maj;
	private String grd;
	public Univ_inf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Univ_inf(int fren_nmbr, String fren_nm, String fren_phn_nmbr, String fren_email, String fren_addr,
			String fren_photo, MultipartFile filename, int mmbr_nmbr, int id, int id2) {
		super(fren_nmbr, fren_nm, fren_phn_nmbr, fren_email, fren_addr, fren_photo, filename, mmbr_nmbr, id, id2);
		// TODO Auto-generated constructor stub
	}
	public Univ_inf(int univ_numbr, String maj, String grd) {
		super();
		this.univ_numbr = univ_numbr;
		this.maj = maj;
		this.grd = grd;
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
		return "Univ_inf [univ_numbr=" + univ_numbr + ", maj=" + maj + ", grd=" + grd + ", getFren_nmbr()="
				+ getFren_nmbr() + ", getFren_nm()=" + getFren_nm() + ", getFren_phn_nmbr()=" + getFren_phn_nmbr()
				+ ", getFren_email()=" + getFren_email() + ", getFren_addr()=" + getFren_addr() + ", getFren_photo()="
				+ getFren_photo() + ", getFilename()=" + getFilename() + ", getMmbr_nmbr()=" + getMmbr_nmbr()
				+ ", getId()=" + getId() + ", getId2()=" + getId2() + "]";
	}

	
	
	
}
