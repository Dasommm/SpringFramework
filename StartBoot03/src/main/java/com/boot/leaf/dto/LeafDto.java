package com.boot.leaf.dto;

public class LeafDto {

	private String subject;
	private int seq;
	
	public LeafDto() {
		super();
	}
	
	public LeafDto(String subject, int seq) {
		super();
		this.subject = subject;
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	
	
	
}
