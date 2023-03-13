package question3;

public class Maymun extends MemeliHayvan {

	public Maymun(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikeliMi(false);
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " bağırıyor!!!");

	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " yürüyor...");

	}

}
