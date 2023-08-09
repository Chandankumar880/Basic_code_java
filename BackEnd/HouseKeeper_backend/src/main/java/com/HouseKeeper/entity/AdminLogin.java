package com.HouseKeeper.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_login")
public class AdminLogin {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String admin_name;
	private String admin_password;
	private String admin_email;
	
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AdminLogin(String admin_name, String password) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}
	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	
	
	public int getempId() {
		return empId;
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getadmin_name() {
		return admin_name;
	}

	public void setadmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getadmin_password() {
		return admin_password;
	}

	public void setadmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	

	@Override
	public String toString() {
		return "AdminLogin [empId=" + empId + ", admin_name=" + admin_name + ", admin_email=" + admin_email +", admin_password=" + admin_password + "]";
	}
	
	
}
