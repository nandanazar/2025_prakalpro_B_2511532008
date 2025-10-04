package Pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511532008 {

	public static void main(String[] args) {

		Scanner Keyboard = new Scanner(System.in);
		int JumlahTiket;
		int NamaFilm;
		int hari;
		
		int HargaTiket = 0;
		int HargaTiket2 = 0;
		int HargaTiket3 = 0;
	
		int HargaTiketTotal = 0;
		int JamTayang ;
		String JamTayang2 = "" ;
		String NamaFilm2 = "";
		String Nama;
		String Extra = "";
		String Extra2 = "";
		
		
		System.out.println("======   BIOSKOP KAPALO BANDA   ======");
		System.out.println("Welcome to Kapalo Banda");
		System.out.print("Masukan Nama Anda   : ");
		Nama = Keyboard.nextLine();
		System.out.println("______________________________________");
		System.out.println("LIST FILM         :1.SPIDERMAN");
		System.out.println("                   2.HULK 2");
		System.out.println("                   3.IRONMAN");
		System.out.println("                   4.AZAB TUKANG TIMPA");
		System.out.println("______________________________________");

		System.out.print("Pilih FILM NO.[_] : ");
		NamaFilm = Keyboard.nextInt();
		
		switch (NamaFilm) {
			case 1 :
				NamaFilm2 = "SPIDERMAN";
			break;
			case 2 :
				NamaFilm2 = "HULK 2";
			break;
			case 3 :
				NamaFilm2 = "IRONMAN";
			break;
			case 4 :
				NamaFilm2 = "AZAB TUKANG TIMPA";
			break;
			default :
				System.out.println("FILM TIDAK TERSEDIA");
				System.exit(0);
	
		}
		
		if (NamaFilm2 == "SPIDERMAN") {
			HargaTiket = 50000;
		} else if (NamaFilm2 == "HULK 2") {
			HargaTiket = 55000;
		} else if (NamaFilm2 == "IRONMAN") {
			HargaTiket = 60000;
		} else if (NamaFilm2 == "AZAB TUKANG TIMPA") {
			HargaTiket = 65000;
		} else {
			System.exit(0);
		}
		System.out.println("_______________________________________");
		System.out.println("1.Senin-Jumat    : Harga Normal");
		System.out.println("2.Sabtu-Minggu   : Extra Charge 20%");
		System.out.print("HARI MENONTON    : ");
		hari = Keyboard.nextInt();
		System.out.println("_______________________________________");
		
		
		switch (hari) {
			case 1 :
				Extra = "0%";
				HargaTiket2 = HargaTiket ;
				break;
			case 2 : 
				Extra = "20%";
				HargaTiket2 = HargaTiket + (HargaTiket * 20/100) ;
				break;
			default :
				System.out.println("HARI TIDAK VALID");
				System.exit(0);
				
		}
		System.out.println("_______________________________________");
		System.out.println("1.Pagi  09:00-12:00 (Harga Normal)");
		System.out.println("2.Siang 12:00-16:00 (Extra 20%)");
		System.out.println("3.Malam 16:00-22:00 (Extra 50%)");
		System.out.print("PILIH WAKTU TAYANG : ");
		JamTayang = Keyboard.nextInt();
		System.out.println("_______________________________________");
		

		switch (JamTayang) {
			case 1 :
				Extra2 = "0%";
				JamTayang2 = "Pagi";
				HargaTiket3 = HargaTiket2 ;
				break;
			case 2 :
				Extra2 = "20%";
				JamTayang2 = "Siang";
				HargaTiket3 = HargaTiket2 + (HargaTiket2 * 20/100);
				break;
			case 3 :
				Extra2 = "50%";
				JamTayang2 = " Malam";
				HargaTiket3 = HargaTiket2 + (HargaTiket2 * 50/100);
				break;
			default :
				System.out.println("JAM TIDAK VALID");
				System.exit(0);
				
		}
		System.out.println("_______________________________________");
		System.out.print("JUMLAH TIKET     : "); 
		JumlahTiket = Keyboard.nextInt();
		HargaTiketTotal = HargaTiket3 * JumlahTiket;
		System.out.println("_______________________________________");
		Keyboard.close();
		
		System.out.println("==========   INVOICE TIKET   ==========");
		System.out.println("Nama Pembeli : " + Nama);
		System.out.println("Nama Film    : " + NamaFilm2);
		System.out.println("Jumlah Tiket : " + JumlahTiket);
		System.out.println("Jam Tayang   : " + JamTayang2);
		System.out.println("_______________________________________");
		System.out.println("Harga Dasar Tiket : " + HargaTiket);
		System.out.println("ExtraCharge Hari  : " + Extra);
		System.out.println("ExtraCHarge Jam   : " + Extra2);
		System.out.println("Harga Per Tiket   : " + HargaTiket3);
		System.out.println("Total Harga       : " + HargaTiketTotal);
		System.out.println("_______________________________________");
		

		
	
		

		
		
		
		
		
	}

}

