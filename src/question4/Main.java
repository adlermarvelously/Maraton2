package question4;

public class Main {

	public static void main(String[] args) {
		
			
			Yolcu yolcu1 = new BusinessYolcu(7755, "Merve", "Adler", false);
			Yolcu yolcu2 = new EkonomiYolcu(889,"Yiğit", "Demir");
			Yolcu yolcu3 = new BusinessYolcu(555, "Ali", "Kaya", true);
			
			System.out.println("****** Businness VIP Yolcu********");
			yolcu3.biletAl(FirmaAdi.ADJ);
			yolcu3.biletAl(FirmaAdi.THY);
			System.out.println("****");
			yolcu3.ucagaBin();
			yolcu3.ucagaBin();
			yolcu3.checkInYap();
			yolcu3.checkInYap();
			yolcu3.ucagaBin();
			yolcu3.yolcuBilgileriniGetir();
			
			System.out.println("************ Ekonomi Yolcu ************");
			yolcu2.biletAl(FirmaAdi.ADJ);
			yolcu2.biletAl(FirmaAdi.THY);
			yolcu2.biletAl(FirmaAdi.THY);
			yolcu2.biletAl(FirmaAdi.THY);
			System.out.println("******");
			yolcu2.ucagaBin();
			yolcu2.ucagaBin();
			yolcu2.checkInYap();
			yolcu2.checkInYap();
			yolcu2.ucagaBin();
			yolcu2.yolcuBilgileriniGetir();
			
		}
	}
