package jp.co.aforce.sample;

public class Main {

	public static void main(String[] args) {
		Taiyaki cleamTaiyaki = new Taiyaki();
		cleamTaiyaki.setFilling("クリーム");
		cleamTaiyaki.showFilling();
		Taiyaki ankoTaiyaki = new Taiyaki();
		ankoTaiyaki.setFilling("あんこ");
		ankoTaiyaki.showFilling();
	}

}
