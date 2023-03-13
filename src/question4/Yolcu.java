package question4;

import java.util.Random;

public abstract class Yolcu {
	
	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	private final int BASEFIYAT;
	static Random random = new Random();
	
	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.checkIn=false;
		this.koltukNo = random.nextInt(0,100);
	    this.BASEFIYAT = 100;
	}
	
	public abstract void yolcuBilgileriniGetir();
	public abstract void biletAl(FirmaAdi firmaAdi);
	public abstract void checkInYap();
	public abstract void ucagaBin();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}
	
	public boolean isCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getBASEFIYAT() {
		return BASEFIYAT;
	}

	

	
	
	
	
	
	
}
