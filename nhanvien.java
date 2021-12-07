package GK_IT5;

import java.util.Scanner;

public class nhanvien {
	private String Hoten;
	private int NSinh;
	private double Heso;
	private int Thamnien;
	public nhanvien(){
		
	}
	// 
	public nhanvien(String Hoten, int NSinh, double Heso , int Thamnien){
		this.Hoten = Hoten;
		this.NSinh = NSinh;
		this.Heso = Heso;
		this.Thamnien = Thamnien;
	}
	
	// get set
	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}


	public int getNSinh() {
		return NSinh;
	}

	public void setNSinh(int nSinh) {
		NSinh = nSinh;
	}

	public double getHeso() {
		return Heso;
	}

	public void setHeso(double heso) {
		Heso = heso;
	}

	public int getThamnien() {
		return Thamnien;
	}

	public void setThamnien(int thamnien) {
		Thamnien = thamnien;
	}
	
	//nhap thong tin
	void nhapThongtin(){
		
		Scanner k = new Scanner(System.in);
		System.out.print("Nhap Hoten :");
		String Hoten = k.nextLine();
		System.out.print("Nhap Ngay sinh:");
		int NSinh = Integer.parseInt(k.nextLine());
		System.out.print("Nhap He so :");
		double Heso = Double.parseDouble(k.nextLine());
		System.out.print("Nhap Tham nien :");
		int Thamnien = Integer.parseInt(k.nextLine());
	}
	
	//luong
	double luong(){
		return this.Heso*150000 + this.Thamnien*30000;
	}
	
	//xuat thong tin
	String inThongtin(){
		return ("Ten : " + this.Hoten 
				+ ", Nam sinh : " + this.NSinh
				+ ", Luong : " + luong());
	}

}
