package nhanvien;

import java.util.List;

public class Employee {

	private int id;
	
	private String fullname;
	
	private String birthDay;
	
	



	private String phone;
	
	private String email;
	
	private int type;
	
	private List<Certificate> certificateList;
	
	private static int count;
	
	
	

	

	public Employee(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.type = type;
		this.count++;
		this.certificateList = certificateList;
	}
	
	public List<Certificate> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<Certificate> list) {
		this.certificateList = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String string) {
		this.birthDay = string;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullname=" + fullname + ", birthDay=" + birthDay + ", phone=" + phone
				+ ", email=" + email + ", certificateList=" + certificateList.toString() + "]";
	}

	
	
	
	
	
	
}
