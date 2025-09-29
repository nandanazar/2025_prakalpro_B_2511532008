package Pekan4;
import java.util.Scanner;
public class Nilai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Nilai;
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Masukan Nilai :");
		Nilai = Keyboard.nextInt();
		Keyboard.close();
		if (Nilai >= 80) {
			System.out.println("A");
		} else if (Nilai >=70) {
			System.out.println("B");
		} else if (Nilai >= 60) {
			System.out.println("C");
		} else if (Nilai >= 50) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}

}
