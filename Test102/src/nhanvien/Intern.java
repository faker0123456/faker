package nhanvien;

import java.util.List;

public class Intern extends Employee {

	private String majors;

	private String semester;

	private String schoolName;

	public Intern(int id, String fullname, String birthDay, String phone, String email, int type,
			List<Certificate> certificateList) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Intern(int id, String fullname, String birthDay, String phone, String email, int type, List<Certificate> certificateList,
			String majors, String semester, String schoolName) {
		super(id, fullname, birthDay, phone, email, type, certificateList);
		this.majors = majors;
		this.semester = semester;
		this.schoolName = schoolName;
	}

	public String getMajors() {
		return majors;
	}

	public void setMajors(String majors) {
		this.majors = majors;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String toString() {
        return "Intern{" +
                "id='" + getId() + '\'' +
                ", fullName='" + getFullname() + '\'' +
                ", birthday=" + getBirthDay() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", major='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + schoolName + '\'' +
                '}';
    }

}
