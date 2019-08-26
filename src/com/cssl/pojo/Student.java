package com.cssl.pojo;

import java.util.Date;

public class Student {
	private int sid;
	private String sname;
	private Date bornDate;
	
	public Student() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", bornDate=" + bornDate + "]";
	}


	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}


	public Student(int sid, String sname, Date bornDate) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.bornDate = bornDate;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	
	

}
