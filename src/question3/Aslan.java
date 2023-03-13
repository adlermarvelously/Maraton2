package question3;

public class Aslan extends MemeliHayvan {

	public Aslan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		setTehlikeliMi(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(this.getAd() + " kükrüyor!!!");

	}

	@Override
	public void yuru() {
		System.out.println(this.getAd() + " yürüyor...");

	}

}
