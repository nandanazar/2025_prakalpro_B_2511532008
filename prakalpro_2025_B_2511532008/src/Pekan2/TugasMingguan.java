package Pekan2;

import java.util.Scanner;



public class TugasMingguan {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String NIM;
		String Nama_Lengkap;
		int Umur;
		
		
		System.out.println("Masukan NIM : ");
		NIM = scanner.nextLine();
		System.out.println("Masukan Nama Lengkap : ");
		Nama_Lengkap = scanner.nextLine();
		System.out.println("Masukan Umur : ");
		Umur = scanner.nextInt();
		
		
		String StrUmur = String.valueOf(Umur);
		Long IntNIM = Long.parseLong(NIM);
		
		
		System.out.println("=== Data Mahasiswa ===");
		System.out.println("NIM  : " + NIM);
		System.out.println("Nama : " + Nama_Lengkap);
		System.out.println("Umur : " + Umur + " Tahun");
		System.out.println("");
		
		System.out.println ("Umur (String) :" + StrUmur);
		System.out.println( "NIM + Umur    :" + (IntNIM + Umur) );
		
		
	
		scanner.close();
	}

}
