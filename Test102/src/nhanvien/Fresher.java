package nhanvien;

import java.util.List;

public class Fresher extends Employee {

	
	

	private String graduationDate;
	
	private String graduationRank;
	
	private String universityName;

	public Fresher(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	

	public Fresher(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList, String graduationDate, String graduationRank, String  universityName) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.universityName =  universityName;
	}



	public String getUniversityName() {
		return universityName;
	}



	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}



	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	
	@Override
    public String toString() {
        
		return "Fresher{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullname() + '\'' +
                ", birthday=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

}
