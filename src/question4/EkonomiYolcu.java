package question4;


	import java.util.HashMap;
	import java.util.Map;

	public class EkonomiYolcu extends Yolcu {
		
		
		private int toplamBiletFiyat;
		private final int EKONOMIFIYAT;
		
		static Map<String,Integer> biletlerEkonomi = new HashMap<>();
		
		public EkonomiYolcu(int id, String ad, String soyad) {
			super(id, ad, soyad);
			this.EKONOMIFIYAT=100;
		}
		@Override
		public void yolcuBilgileriniGetir() {
			System.out.println("Yolcu Bilgileri --> Business Yolcusu "+getAd()+" Biletleri "+getEkonomiBiletler());
			
		}

		@Override
		public void biletAl(FirmaAdi firmaAdi) {
			
			
			if(biletlerEkonomi.containsKey(firmaAdi.name())) {
				setToplamBiletFiyat(getToplamBiletFiyat()+getBASEFIYAT()+this.EKONOMIFIYAT);
				biletlerEkonomi.replace(firmaAdi.name(), getToplamBiletFiyat());
				System.out.println(getAd()+" adlÄ± yolcu "+firmaAdi.name()+" için Ekonomi sınıfından bilet alınmıştır. Biletleriniz --> "+getEkonomiBiletler());
			}
			else {
				setToplamBiletFiyat(getToplamBiletFiyat()+getBASEFIYAT()+this.EKONOMIFIYAT);
				biletlerEkonomi.put(firmaAdi.name(), this.getToplamBiletFiyat());
				System.out.println(getAd()+" adlÄ± yolcu "+firmaAdi.name()+" için Ekonomi sınıfından bilet almıştır. Biletleriniz --> "+getEkonomiBiletler());
			}
			
			
			
		}

		@Override
		public void checkInYap() {
			if(isCheckIn()==false) {
				setCheckIn(true);
				System.out.println("Checkin yapılmıştır iyi uçuşlar");
			}else {
				System.out.println(getAd()+" checkin zaten yapılmıştır, uçaşa binebilirsiniz.");
			}
			
		}

		@Override
		public void ucagaBin() {
			if(isCheckIn()==false) {
				System.out.println("Uçağa binmek için lütfen checkin yapın");
			}else {
				System.out.println(getAd()+" "+getKoltukNo()+" numaralı koltukta uçağa binebilirsiniz.");
			}
			
		}
		public static Map<String, Integer> getEkonomiBiletler() {
			return biletlerEkonomi;
		}
		public static void setBiletler(Map<String, Integer> biletler) {
			EkonomiYolcu.biletlerEkonomi = biletler;
		}
		public int getEKONOMIFIYAT() {
			return EKONOMIFIYAT;
		}
		public int getToplamBiletFiyat() {
			return toplamBiletFiyat;
		}
		public void setToplamBiletFiyat(int toplamBiletFiyat) {
			this.toplamBiletFiyat = toplamBiletFiyat;
		}
		public static Map<String, Integer> getBiletlerEkonomi() {
			return biletlerEkonomi;
		}
		public static void setBiletlerEkonomi(Map<String, Integer> biletlerEkonomi) {
			EkonomiYolcu.biletlerEkonomi = biletlerEkonomi;
		}
		
		
		
		
		
	}
