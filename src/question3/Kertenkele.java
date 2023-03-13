package question3;

public class Kertenkele extends Surungen {

	public Kertenkele(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikeliMi(false);

	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " ses çıkarıyor...");

	}

	@Override
	public void surun() {
		System.out.println(this.getAd() + " sürünüyor...");

	}

}
