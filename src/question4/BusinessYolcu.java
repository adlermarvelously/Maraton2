package question4;

import java.util.HashMap;
import java.util.Map;

public class BusinessYolcu extends Yolcu {

	private final int BUSINNESFIYAT;
	private final int BUSINNESVIPFIYAT;
	private boolean isVIP;
		
	static Map<String,Integer> biletlerBusiness = new HashMap<>();
	
	public BusinessYolcu(int id, String ad, String soyad,boolean isVIP) {
		super(id, ad, soyad);
		this.BUSINNESFIYAT=200;
		this.BUSINNESVIPFIYAT=150;
		this.isVIP=isVIP;
	}
	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Yolcu Bilgileri --> Ekonomi Yolcusu, "+getAd()+" Biletleri "+getBusinessBiletler());
		
	}
	@Override
	public void biletAl(FirmaAdi firmaAdi) {
		if(isVIP == true) {
			int biletFiyati = getBASEFIYAT()+BUSINNESFIYAT+BUSINNESVIPFIYAT;
			biletlerBusiness.put(firmaAdi.name(), biletFiyati);
			System.out.println(getAd()+" adlı yolcu "+firmaAdi.name()+" için VIP bilet almıştır. Biletleriniz --> "+getBusinessBiletler());
		}else {
			int biletFiyati = getBASEFIYAT()+BUSINNESFIYAT;
			biletlerBusiness.put(firmaAdi.name(), biletFiyati);
			System.out.println("BUSINESS Bilet almıştır.");
		}
		
	}
	@Override
	public void checkInYap() {
		if(isCheckIn()==false) {
			setCheckIn(true);
			System.out.println("Checkin yapılmıştır, iyi uçuşlar!");
		}else {
			System.out.println(getAd()+" checkin zaten yapılmıştır, uçağa binebilirsiniz.");
		}
		
	}
	@Override
	public void ucagaBin() {
		if(isCheckIn()==false) {
			System.out.println("Uçağa binmek için lütfen checkin yapın...");
		}else {
			System.out.println(getAd()+" "+getKoltukNo()+" numaralı koltukta uçağa binebilirsiniz.");
		}
		
	}
	public boolean isVIP() {
		return isVIP;
	}
	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}
	public static Map<String, Integer> getBusinessBiletler() {
		return biletlerBusiness;
	}
	public static void setBiletler(Map<String, Integer> biletlerBusiness) {
		BusinessYolcu.biletlerBusiness = biletlerBusiness;
	}
	public int getBUSINNESFIYAT() {
		return BUSINNESFIYAT;
	}
	public int getBUSINNESVIPFIYAT() {
		return BUSINNESVIPFIYAT;
	}
	
}

