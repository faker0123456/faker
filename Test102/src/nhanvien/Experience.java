package nhanvien;

import java.util.List;

public class Experience extends Employee {
	
	

	private String expInYear;
	
	private String skill;

	
	public Experience(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		// TODO 自動生成されたコンストラクター・スタブ
	}


	public Experience(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList, String expInYear, String skill) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		this.expInYear = expInYear;
		this.skill = skill;
	}


	public String getExpInYear() {
		return expInYear;
	}


	public void setExpInYear(String expInYear) {
		this.expInYear = expInYear;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override
    public String toString() {
        return "Experience{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullname() + '\'' +
                ", birthday=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", yearOfExperience=" + expInYear +
                ", proSkill='" + skill + '\'' +
                '}';
    }


	public void setcertificateListl(List<String> list) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	
	
	
	
	

}
