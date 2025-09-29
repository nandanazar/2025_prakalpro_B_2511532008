package Pekan4;
import java.util.Scanner;
public class multiif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int umur;
		char sim;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Masukan Umur : ");
		umur = keyboard.nextInt();
		System.out.println("Apakah Anda Sudah Punya SIM C ? ");
		sim = keyboard.next().charAt(0);
		keyboard.close();
		
		if ((umur >= 17) && (sim == 'y')) {
			System.out.println("Anda Sudah Dewasa dan Boleh Bawa Motor");
			}else if ((umur >= 17)&& (sim != 'y')) {		
			System.out.println("Anda Sudah Dewasa tapi tidak boleh bawa motor");
			}else if ((umur < 17)&& (sim == 'y')) {
				System.out.println("Anda Belum Cukup Umur Untuk Bawa Motor");
			}else if ((umur < 17) && (sim != 'y')) {
				System.out.println("Anda Belum Cukup Umur Untuk Bawa Motor");
		}
			
	}

}
