package Pekan3;
import java.util.Scanner;

public class hitungvolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		float PI = 3.14f;
		float jari_jari;
		float tinggi;
		float hasil;
		
		System.out.println("=== PROGRAM MENGHITUNG VOLUME TABUNG ===");
		System.out.println("Masukan jari-jari tabung(r) :");
		jari_jari = keyboard.nextFloat();
		System.out.println("Masukan tinggi tabung (t)   :");
		tinggi = keyboard.nextFloat();
		
		keyboard.close();
		
		
		System.out.println("======       Volume Tabung     ======");
		hasil = (PI * (jari_jari * jari_jari) * tinggi);
		System.out.println("Volume Tabung : ");
		System.out.println("Perhitungan   : " +PI +" * "+ jari_jari +"^2"+" * "+ tinggi );
		System.out.println("Hasil         : " + hasil);

	}

}
