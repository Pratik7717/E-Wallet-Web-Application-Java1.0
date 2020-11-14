package model;

public class Register {
	private String fname;
	private String lname;
	private String mob;
	private String uname;
	private String pass;
	public Register(String fname, String lname, String mob, String uname, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mob = mob;
		this.uname = uname;
		this.pass = pass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	};
	
	
	
}
