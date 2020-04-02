package com.mvc.ex01.model.dto;

import java.sql.Date;

public class ExboardDto {

	private int exno;
	private String exname;
	private String extitle;
	private String excontent;
	private Date exdate;
	
	public ExboardDto() {
		super();
	}
	public ExboardDto(int exno, String exname, String extitle, String excontent, Date exdate) {
		super();
		this.exno = exno;
		this.exname = exname;
		this.extitle = extitle;
		this.excontent = excontent;
		this.exdate = exdate;
	}
	public int getExno() {
		return exno;
	}
	public void setExno(int exno) {
		this.exno = exno;
	}
	public String getExname() {
		return exname;
	}
	public void setExname(String exname) {
		this.exname = exname;
	}
	public String getExtitle() {
		return extitle;
	}
	public void setExtitle(String extitle) {
		this.extitle = extitle;
	}
	public String getExcontent() {
		return excontent;
	}
	public void setExcontent(String excontent) {
		this.excontent = excontent;
	}
	public Date getExdate() {
		return exdate;
	}
	public void setExdate(Date exdate) {
		this.exdate = exdate;
	}
	
	
	
}
