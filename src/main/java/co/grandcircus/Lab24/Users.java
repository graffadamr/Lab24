package co.grandcircus.Lab24;

public class Users {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	public Users() {
		super();
	}

	public Users(String id, String fname, String lname, String email, String phone) {
		super();
		this.id = Integer.parseInt(id);
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public Users(String fname, String lname, String email, String phone) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
	
	

}
