package com.bit.phone.Model;

import org.springframework.web.multipart.MultipartFile;

public class Comp_inf extends Fren_inf {

	private int comp_nmbr;// 회사친구 번호
	private String comp_nm; // 회사친구 이름
	public Comp_inf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comp_inf(int fren_nmbr, String fren_nm, String fren_phn_nmbr, String fren_email, String fren_addr,
			String fren_photo, MultipartFile filename, int mmbr_nmbr, int id, int id2) {
		super(fren_nmbr, fren_nm, fren_phn_nmbr, fren_email, fren_addr, fren_photo, filename, mmbr_nmbr, id, id2);
		// TODO Auto-generated constructor stub
	}
	public Comp_inf(int comp_nmbr, String comp_nm) {
		super();
		this.comp_nmbr = comp_nmbr;
		this.comp_nm = comp_nm;
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
	@Override
	public String toString() {
		return "Comp_inf [comp_nmbr=" + comp_nmbr + ", comp_nm=" + comp_nm + ", getFren_nmbr()=" + getFren_nmbr()
				+ ", getFren_nm()=" + getFren_nm() + ", getFren_phn_nmbr()=" + getFren_phn_nmbr() + ", getFren_email()="
				+ getFren_email() + ", getFren_addr()=" + getFren_addr() + ", getFren_photo()=" + getFren_photo()
				+ ", getFilename()=" + getFilename() + ", getMmbr_nmbr()=" + getMmbr_nmbr() + ", getId()=" + getId()
				+ ", getId2()=" + getId2() + "]";
	}

}
