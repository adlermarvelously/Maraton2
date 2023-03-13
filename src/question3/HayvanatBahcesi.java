package question3;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi {

	List<Hayvan> hayvanlar = new ArrayList<>();
	List<MemeliHayvan> memeliler = new ArrayList<>();
	List<Surungen> surungenler = new ArrayList<>();

	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {

		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd() == m.getAd()) {
				System.out.println("Hayvanat bahçesinde bu isimde hayvan bulunmaktadır!");
				return;
			}
		}

		hayvanlar.add(m);
		System.out.println("Hayvanat bahçesine, " + m.getAd() + " isimli hayvan eklendi.");

	}

	public void bahceyeSurungenEkle(Surungen s) {

		for (int i = 0; i < surungenler.size(); i++) {
			if (hayvanlar.get(i).getAd() == s.getAd()) {
				System.out.println("Hayvanat bahçesinde bu isimde hayvan bulunmaktadır.");
				return;
			}
		}

		hayvanlar.add(s);
		System.out.println("Hayvanat bahçesine, " + s.getAd() + " isimli hayvan eklenmiştir.");

	}

	public void hayvanSesCikarsin(Hayvan h) {

		h.sesCikar();

	}

	public void hayvaninCinsiniBul(String hayvanAdi) {

		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {

				if (hayvanlar.get(i).toString().substring(0, 1).equalsIgnoreCase("m")) {
					System.out.println(hayvanlar.get(i).getAd() + " bir memelidir.");
				} else if (hayvanlar.get(i).toString().substring(0, 1).equalsIgnoreCase("s")) {
					System.out.println(hayvanlar.get(i).getAd() + " bir sürüngendir.");
				} else {
					System.out.println("Bu isimde bir hayvan hayvanat bahçesinde bulunmamaktadır.");
				}
				return;

			}
		}

	}

	public void hayvaninBilgileriniYazdir(String hayvanAdi) {

		for (int i = 0; i < hayvanlar.size(); i++) {
			if (hayvanlar.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {
				System.out.println(hayvanlar.get(i).toString());
				return;
			}
		}

		System.out.println(hayvanAdi + " isminde bir hayvan hayvanat bahçesinde bulunmamaktadır.");

	}

	public void hayvaniHareketEttir(String hayvanAdi) {

		for (int i = 0; i < memeliler.size(); i++) {

			if (memeliler.get(i).getAd().equalsIgnoreCase(hayvanAdi)) {

				memeliler.get(i).yuru();
			}

		}
		for (int j = 0; j < surungenler.size(); j++) {
			if (surungenler.get(j).getAd().equalsIgnoreCase(hayvanAdi)) {
				surungenler.get(j).surun();
			}
		}

	}

}
