package com.soru3;

public class Runner {

	public static void main(String[] args) {
		CustomStringTR ifade = new CustomStringTR();
		ifade.string = " bilge adam ";
		System.out.println(ifade.string);

		System.out.println(ifade.ileBiten("adam"));
		System.out.println(ifade.ileBaslayan(" bilge"));
		System.out.println(ifade.kacinci("e"));
		System.out.println(ifade.buyuk());
		System.out.println(ifade.kucuk());
		System.out.println(ifade.esit("deneme"));
		System.out.println(ifade.degistir("e", "a"));
		System.out.println(ifade.konumdakiKarakter(3));
		System.out.println(ifade.uzunluk());
		System.out.println(ifade.boslukKes());

	}
}