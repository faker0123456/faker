package quanlynhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import exception.Exception;
import nhanvien.Certificate;
import nhanvien.Employee;
import nhanvien.Experience;
import nhanvien.Fresher;
import nhanvien.Intern;

public class QuanLyNhanVien {
	Scanner scanner = new Scanner(System.in);
	Exception e = new Exception();
	private List<Employee> employees;

	public QuanLyNhanVien() {

		this.employees = new ArrayList<>();
	}

	public List<Certificate> inputCertificate(int num) {

		List<Certificate> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Certificate c = new Certificate();
			System.out.printf("nhap chung chi so %d:", i + 1);
			i++;
			c.setId(i);

			System.out.println("name:");
			c.setName(scanner.nextLine());
			System.out.println("rank:");
			c.setRank(scanner.nextLine());
			System.out.println("date:");
			c.setDate(scanner.nextLine());
			list.add(c);

		}

		return list;
	}

	public Experience insertExperience() {

		List<Certificate> list;

		System.out.print("Input ID: ");

		int id = Integer.parseInt((scanner.nextLine()));
		System.out.print("Input Name: ");
		String name = scanner.nextLine();

		System.out.print("Input Phone: ");

		String phone = scanner.nextLine();
		System.out.print("Input Email: ");

		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();

		int type = 0;

		System.out.print("nhap so luong chung chi : ");
		int n = Integer.parseInt((scanner.nextLine()));

		list = inputCertificate(n);
		System.out.print("Input expInYear: ");
		String y = scanner.nextLine();
		System.out.print("Input skill: ");
		String skill = scanner.nextLine();

		Experience experience = new Experience(id, name, birthday, phone, email, type, list, y, skill);

		return experience;
	}

	private Intern insertIntern() {

		List<Certificate> list = new ArrayList<>();
		System.out.print("Input ID: ");

		int id = Integer.parseInt((scanner.nextLine()));

		System.out.print("Input Name: ");
		String name = scanner.nextLine();
		System.out.print("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Input Email: ");
		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();

		int type = 2;
		System.out.print("nhap so luong chung chi : ");
		int n = Integer.parseInt((scanner.nextLine()));

		list = inputCertificate(n);

		System.out.print("Input majors: ");
		String majors = scanner.nextLine();
		System.out.print("Input semester: ");
		String semester = scanner.nextLine();
		System.out.print("Input school: ");
		String schoolName = scanner.nextLine();
		Intern intern = new Intern(id, name, birthday, phone, email, type, list, majors, semester, schoolName);

		// TODO
		return intern;

	}

	private Fresher insertFresher() {
		List<Certificate> list = new ArrayList<>();
		System.out.print("Input ID: ");

		int id = Integer.parseInt((scanner.nextLine()));

		System.out.print("Input Name: ");
		String name = scanner.nextLine();
		System.out.print("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Input Email: ");
		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();

		int type = 1;
		System.out.print("nhap so luong chung chi : ");
		int n = Integer.parseInt((scanner.nextLine()));

		list = inputCertificate(n);

		System.out.print("Input graduationDate : ");
		String graduationDate = scanner.nextLine();
		System.out.print("Input graduationRank: ");
		String graduationRank = scanner.nextLine();
		System.out.print("Input universityName: ");
		String universityName = scanner.nextLine();

		Fresher fresher = new Fresher(id, name, birthday, phone, email, type, list, graduationDate, graduationRank,
				universityName);

		// TODO
		return fresher;

	}

	public void findByType(int type) {
		this.employees.stream()
				.filter(employee -> {
					if (type == 0) {
						return employee instanceof Experience;
					}
					if (type == 1) {
						return employee instanceof Fresher;
					}
					if (type == 2) {
						return employee instanceof Intern;
					}
					
					//System.out.println("khong co nhan vien nao");
					return false;
				})
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private boolean checkAll(Employee employee) {
		if (employee == null) {
			return false;
		}

		if (!e.checkName(employee.getFullname())) {
			System.out.println("ten ko hop le");
			return false;
		} else if (!e.checkPhone(employee.getPhone())) {
			System.out.println("so dt ko hop le");
			return false;
		} else if (!e.checkEmail(employee.getEmail())) {
			System.out.println("email ko hop le");
			return false;
		} else if (!e.checkBirthday(employee.getBirthDay())) {
			System.out.println("ngay sinh ko hop le");
			return false;
		} else {

			return true;
		}

	}

	private Intern editIntern() {
		List<Certificate> list = new ArrayList<>();

		System.out.println("Input id");
		int n = Integer.parseInt((scanner.nextLine()));

		System.out.print("Input Name: ");
		String name = scanner.nextLine();
		System.out.print("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Input Email: ");
		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();
		int type = 2;
		System.out.print("Input majors: ");
		String majors = scanner.nextLine();
		System.out.print("Input semester: ");
		String semester = scanner.nextLine();
		System.out.print("Input school: ");
		String schoolName = scanner.nextLine();

		Intern intern = new Intern(n, name, birthday, phone, email, type, list, majors, semester, schoolName);
		return intern;

	}

	private Fresher editFresher() {

		List<Certificate> list = new ArrayList<>();

		System.out.println("Input id");
		int n = Integer.parseInt((scanner.nextLine()));
		System.out.print("Input Name: ");
		String name = scanner.nextLine();
		System.out.print("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Input Email: ");
		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();

		int type = 1;

		System.out.print("Input graduationDate : ");
		String graduationDate = scanner.nextLine();
		System.out.print("Input graduationRank: ");
		String graduationRank = scanner.nextLine();
		System.out.print("Input universityName: ");
		String universityName = scanner.nextLine();

		Fresher fresher = new Fresher(n, name, birthday, phone, email, type, list, graduationDate, graduationRank,
				universityName);

		return fresher;
	}

	private Experience editExperience() {
		List<Certificate> list = new ArrayList<>();

		System.out.println("nhap id");
		int n = Integer.parseInt((scanner.nextLine()));

		System.out.print("Input Name: ");
		String name = scanner.nextLine();
		System.out.print("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Input Email: ");
		String email = scanner.nextLine();
		System.out.print("Input birthday: ");
		String birthday = scanner.nextLine();

		int type = 0;

		System.out.print("Input expInYear: ");
		String y = scanner.nextLine();
		System.out.print("Input skill: ");
		String skill = scanner.nextLine();

		Experience experience = new Experience(n, name, birthday, phone, email, type, list, y, skill);

		return experience;

	}

	public void findAll() {
		boolean checkTontai = false;

		for (Employee e : this.employees) {
			System.out.println(e);
			checkTontai = true;
		}
		if (!checkTontai) {
			System.out.println("khong co nhan vien nao");

		}

	}

	public void insert(int type) {
		Employee employee = null;

		boolean checkOk = false;

		while (!checkOk) {
			if (type == 0) {
				employee = insertExperience();
				checkOk = checkAll(employee);

			}
			if (type == 1) {
				employee = insertFresher();
				checkOk = checkAll(employee);

			}
			if (type == 2) {
				employee = insertIntern();
				checkOk = checkAll(employee);

			}
		}
		System.out.println("da them thanh cong");
		this.employees.add(employee);

	}

	public void editById(int n) {

		boolean checkTontai = false;

		boolean checkOk = false;

		Employee employee = null;

		for (int i = 0; i < this.employees.size(); i++) {

			if (this.employees.get(i).getId() == n) {

				if (this.employees.get(i).getType() == 0) {
					this.employees.remove(i);
					checkTontai = true;
					while (!checkOk) {

						employee = editExperience();
						checkOk = checkAll(employee);

					}

					this.employees.add(employee);
					System.out.println("da them thanh cong");
				}
				if (this.employees.get(i).getType() == 1) {
					this.employees.remove(i);
					checkTontai = true;
					while (!checkOk) {
						employee = editFresher();
						checkOk = checkAll(employee);

					}
					this.employees.add(employee);
					System.out.println("da them thanh cong");
				}

				if (this.employees.get(i).getType() == 2) {
					this.employees.remove(i);
					checkTontai = true;
					while (!checkOk) {
						employee = editIntern();
						checkOk = checkAll(employee);
					}
					this.employees.add(employee);
					System.out.println("da them thanh cong");
				}

			}

		}

		if (!checkTontai) {
			System.out.println("khong co nhan vien nao");
			return;

		}

	}

	public void deleteById(int n) {

		boolean checkTontai = false;

		for (Employee e : employees) {
			if (e.getId() == n) {

				employees.remove(e);

				checkTontai = true;
				break;

			}
			System.out.println("da xoa nhan vien");
		}

		if (!checkTontai) {
			System.out.println("nhan vien khong ton tai");
		}

	}

	public static void showMenu() {

		System.out.println("1. Add employee.");
		System.out.println("2. Delete  by id.");
		System.out.println("3. Get by type.");
		System.out.println("4. Show all.");
		System.out.println("5. Edit by type.");
		System.out.println("0. exit.");
	}

}
