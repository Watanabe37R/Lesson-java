package jp.co.aforce.sample;

public class Taiyaki {
	String filling;
	
	public void setFilling(String value) {
		filling=value;
	}
	public void showFilling() {
		System.out.println("このたい焼きの中身は"+filling+"です。");
	}
}
