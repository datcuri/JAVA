package GK_IT5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayNV {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		System.out.print(" Nhap n: ");
		int n = Integer.parseInt(k.nextLine());
		nhanvien[] nv = new nhanvien[3];
		
		//test
		/* 
		n = 3;
		nv[0] = new nhanvien("dothanhdat", 2003 , 4.7, 5 );
		nv[1] = new nhanvien("tranvanhoang", 2003 , 9.3, 22);
		nv[2] = new nhanvien("hoangnhuanh", 2003 , 3.3, 2);*/
		
		//1,
		System.out.print("1,");
		for (int i = 0 ; i<n ; i++ ){
			System.out.println("Nhap thong tin nhan vien " + i +" : " );
			nv[i] = new nhanvien();
			nv[i].nhapThongtin();
		}
		
		//2,
		System.out.print("2,");
		for (int i = 0; i<n ; i++){
			System.out.print("Nhan vien " + i + " : " );
			System.out.println(nv[i].inThongtin());
		}
		
		
		//3,
		System.out.print("3,");
		for (int i = 0; i<n ; i++){
			if (nv[i].getThamnien() >= 20 || nv[i].getHeso() > 8 ){
				System.out.println(nv[i].inThongtin());
			}
		}
		
		//4,
		System.out.print("4,");
		Arrays.sort(nv, new Comparator<nhanvien>() {
			public int compare(nhanvien nv1 , nhanvien nv2){
				return (int) (nv1.luong() - nv2.luong());
			}
		});
		System.out.println("nguoi co luong lon nhat la  "+ nv[0].inThongtin());
	}

}
