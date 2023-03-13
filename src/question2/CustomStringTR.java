package question2;

public class CustomStringTR {

	private String metin;

	public void metinBosMu() {
		System.out.println(metin.isEmpty());
	}

	public void uzunlugu() {
		System.out.println(metin.length());
	}

	public void buyukHarf() {
		System.out.println(metin.toUpperCase());
	}

	public void kucukHarf() {
		System.out.println(metin.toLowerCase());
	}

	public void indexGetir(char arancanKarakter) {
		System.out.println(metin.indexOf(arancanKarakter));
	}

	public void yarisindanSonrasiniGoster() {
		System.out.println(metin.substring(metin.length() / 2));
	}

	public void charArrayCevirme() {
		System.out.println(metin.toCharArray());
	}

	public void sonDeger(String c) {
		System.out.println(metin.lastIndexOf(c));
	}

	public void boslukSilme() {
		System.out.println(metin.trim());
	}

	public void kontrolHarf(String c) {
		System.out.println(metin.contains(c));
	}

	public void esitMi(String c) {
		System.out.println(metin.equals(c));
	}

	public void buyukKucukFarketmedenEsitMi(String c) {
		System.out.println(metin.equalsIgnoreCase(c));
	}

	public CustomStringTR(String kelime) {
		this.metin = kelime;
	}

	public String getKelime() {
		return metin;
	}

	public void setKelime(String kelime) {
		this.metin = kelime;
	}

}
