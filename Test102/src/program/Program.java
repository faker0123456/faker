package program;

import java.util.Scanner;

import exception.Exception;
import quanlynhanvien.QuanLyNhanVien;

public class Program {

	public static void main(String[] args) {

		QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();

		Exception e = new Exception();

		Scanner scanner = new Scanner(System.in);
		

		while (true) {

			quanLyNhanVien.showMenu();

			System.out.println("moi chon thao tac");

			String choose = scanner.nextLine();

			switch (choose) {
			case "1":
				System.out.println("moi nhap type :0:Experience,1:Fresher.2:Intern");
				int i = scanner.nextInt();
				quanLyNhanVien.insert(i);

				break;
			case "2":
				System.out.println("nhap id muon xoa");
				int n = scanner.nextInt();
				quanLyNhanVien.deleteById(n);
				break;
			case "3":
				System.out.println("nhap type muon tim kiem:");
				int t = scanner.nextInt();
				quanLyNhanVien.findByType(t);
				break;
			case "4":
				quanLyNhanVien.findAll();
				break;
			case "5":
				System.out.println("nhap id");
				int id = scanner.nextInt();
				scanner.nextLine();

				quanLyNhanVien.editById(id);
				break;
			
			case "0":
				System.out.println("exited!");
				return;
			default:
				System.out.println("thao tac khong hop le, moi chon lai");
				break;
			}

		}
	}

}
