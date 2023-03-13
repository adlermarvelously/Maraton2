package question2;

public class Main {

	public static void main(String[] args) {

		CustomStringTR customStr = new CustomStringTR(" Hello World, I'm Java! ");
		customStr.metinBosMu();
		customStr.uzunlugu();
		customStr.buyukHarf();
		customStr.kucukHarf();
		customStr.indexGetir('a');
		customStr.yarisindanSonrasiniGoster();
		customStr.sonDeger("a");
		customStr.boslukSilme();
		customStr.kontrolHarf("z");
		customStr.esitMi(" Hello World, I'm Java! ");
		customStr.buyukKucukFarketmedenEsitMi(" hello world, i'm java! ");
	}
}
