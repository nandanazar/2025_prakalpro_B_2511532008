package Pekan5;
import java.util.Scanner;
public class PerulanganFor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard =new Scanner(System.in);
		int jumlah = 0;
		int batas;
		System.out.println("Masukan Nilai Batas : ");
		batas = keyboard.nextInt();
		keyboard.close();
		
		for (int i = 1; i <=batas; i++) {
			System.out.print(i);
			jumlah = jumlah+i;
			if (i < batas) {
				System.out.print(" + ");	
			} else {
				System.out.print(" = ");
			}
		}
		System.out.println(jumlah);
		
	}

}
