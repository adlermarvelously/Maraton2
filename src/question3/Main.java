package question3;

public class Main {

	public static void main(String[] args) {

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();

		Aslan aslan = new Aslan("Simba", 150, 200);
		Yilan yilan = new Yilan("terminator", 15, 200);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Melo", 120, 140));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Ciko", 45, 50));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35));

		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("*********************");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Tiger");
		System.out.println("*********************");
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		System.out.println("*********************");
		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Simba");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");

	}

}
