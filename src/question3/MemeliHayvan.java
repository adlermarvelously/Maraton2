package question3;

public abstract class MemeliHayvan extends Hayvan {

	public abstract void yuru();

	public MemeliHayvan(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MemeliHayvan [getAd()=" + getAd() + ", getKilosu()=" + getKilosu() + ", getUzunlugu()=" + getUzunlugu()
				+ ", isTehlikeliMi()=" + isTehlikeliMi() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
