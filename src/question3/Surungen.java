package question3;

public abstract class Surungen extends Hayvan {

	public abstract void surun();

	public Surungen(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "Surungen [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu()
				+ ", isTehlikeliMi()=" + isTehlikeliMi() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
