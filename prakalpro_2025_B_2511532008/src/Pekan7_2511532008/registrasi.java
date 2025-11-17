package Pekan7_2511532008;

import java.util.Scanner;

public class registrasi {

	public static void main(String[] args) {
		String NamaPengguna;
		String EmailFinal;
		String PasswordFinal;
		int pin;
		Akun Final = new Akun();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("=== REGISTRASI AKUN BARU ===");
		
		System.out.print("Masukan Username : ");
		NamaPengguna = keyboard.nextLine();
		Final.setusername(NamaPengguna);
		
		System.out.print("Masukan Email : ");
		EmailFinal = keyboard.nextLine();
		Final.setemail(EmailFinal);
		
		System.out.print("Masukan Password Anda :");
		PasswordFinal = keyboard.nextLine();
		Final.setpassword(PasswordFinal);
		
		System.out.print("Masukan PIN : ");
		pin = keyboard.nextInt();
		Final.setpin(pin);
		
		if (Final.isEmailValid () && Final.isPasswordValid()) {
			System.out.println("=== REGISTRASI BERHASIL ===");
			System.out.println("Akun " + Final.getemail() + " Berhasil Dibuat");
			System.out.println(" ");
			System.out.println("=== DETAIL AKUN ===");
			System.out.println("Username : " + Final.getusername());
			System.out.println("Email : " + Final.getemail());
			System.out.println("Password :" + Final.getpassword());
			System.out.println("PIN : " + Final.getpin());
			System.out.println(" ");
			System.out.println("---Another Detail Akun---");
			
			String usernamelower = Final.getusername().toLowerCase();
			System.out.println("Username LowerCase : " + usernamelower);
			String emailupper = Final.getemail().toUpperCase();
			System.out.println("Email UpperCase : " + emailupper);
			String Gabungan = (Final.getusername() + Final.getpin());
			System.out.println("ID Pengguna : " + Gabungan);
			
			System.out.println(" ");
			System.out.println("Uji Tipe Data (Pin Anda : " + Final.getpin() + ")");
			
			int number = Integer.valueOf(pin);
			int numberrr = 10;
			System.out.println("PIN (int) + 10 :" + (Final.getpin() + 10));
			String PINSTRING = String.valueOf(Final.getpin());
			System.out.println("PIN (String) + 10 : " + PINSTRING + 10 );

		}
		else {
			System.out.println("=== REGISTRASI GAGAL ===");
			if (!Final.isEmailValid()) {
				System.out.println("Email " + "\"" +Final.getemail() +"\""+ " Tidak Valid harus mengandung '@' dan '.'");
			}
			if (!Final.isPasswordValid()) {
				System.out.println("Password " +"\""+ Final.getpassword()  +"\""+" Tidak valid, minimal 8 karakter");
			}
		keyboard.close();
		}
		
		

	}
}


