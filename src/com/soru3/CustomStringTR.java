package com.soru3;

public class CustomStringTR {

	static String string;

	public static boolean ileBiten(String son) {
		return string.endsWith(son);
	}

	public static int uzunluk() {
		return string.length();
	}

	public static int kacinci(String harf) {
		return string.indexOf(harf);
	}

	public static boolean ileBaslayan(String bas) {
		return string.startsWith(bas);
	}

	public static String buyuk() {
		return string.toUpperCase();
	}

	public static String kucuk() {
		return string.toLowerCase();
	}

	public static String degistir(String a, String b) {
		return string.replace(a, b);
	}

	public static boolean esit(String kelime) {
		return string.equals(kelime);
	}

	public static char konumdakiKarakter(int digit) {
		return string.charAt(digit);
	}

	public static String boslukKes() {
		return string.trim();
	}

}
