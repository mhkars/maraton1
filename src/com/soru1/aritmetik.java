package com.soru1;

import java.util.Scanner;

public class aritmetik {
	static Scanner scanner = new Scanner(System.in);
	static int secim2;
	static int ilknum;
	static int ikincinum;
	static Integer ans;

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		boolean durum = true;
		while (durum) {
			System.out.println();
			System.out.println("***************************************");
			System.out.println("***Yapmak istediginiz islemi seciniz***");
			System.out.println("***************************************");
			System.out.println("1- Dort Islem");
			System.out.println("2- Alan Hesaplama");
			System.out.println("0- CIKIS");
			int secim1 = scanner.nextInt();

			if (secim1 == 1) {
				dortIslem();
			} else if (secim1 == 2) {
				alanHesaplama();
			} else if (secim1 == 0) {
				System.out.println("Cikis Yapildi.");
				durum = false;
			} else {
				System.out.println("Lutfen Secenekler Arasında Bir Tercih Yapınız!");
				menu();
			}
		}
	}

	public static void dortIslem() {
		do {
			System.out.println();
			System.out.println("***************************************");
			System.out.println("***Yapmak istediginiz islemi seciniz***");
			System.out.println("***************************************");
			System.out.println("1- Toplama");
			System.out.println("2- Cikarma");
			System.out.println("3- Carpma");
			System.out.println("4- Bolme");
			System.out.println("0- Ust Menu");
			secim2 = scanner.nextInt();

			switch (secim2) {
			case 1: {
				ans = toplama(ans);
				break;
			}
			case 2: {
				ans = cikartma(ans);
				break;
			}
			case 3: {
				ans = carpma(ans);
				break;
			}
			case 4: {
				ans = bolme(ans);
				break;
			}
			case 0: {
				menu();
				break;
			}
			default:
				System.out.println("Lutfen Secenekler Arasinda Bir Tercih Yapiniz!");
				dortIslem();
				break;
			}
		} while (true);
	}

	public static int toplama(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum + ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans + ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;
		}
	}

	public static int cikartma(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum - ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans - ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

	public static int carpma(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum * ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			scanner.nextLine();
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans * ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

	public static int bolme(Integer sayi) {
		if (ans == null) {
			System.out.println("lutfen islem yapmak istediginiz ilk sayiyi giriniz");
			ilknum = scanner.nextInt();
			System.out.println("lutfen islem yapmak istediginiz ikinci sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ilknum / ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;

		} else {
			System.out.println("lutfen islem yapmak istediginiz sayiyi giriniz");
			ikincinum = scanner.nextInt();
			ans = ans / ikincinum;
			System.out.println("Isleminizin sonucu...: " + ans);
			return ans;
		}
	}

	public static void alanHesaplama() {
		do {
			System.out.println();
			System.out.println("***************************************");
			System.out.println("***Yapmak istediginiz islemi seciniz***");
			System.out.println("***************************************");
			System.out.println("1- Ucgen Alani");
			System.out.println("2- Dortgen Alani");
			System.out.println("0- Ust Menu");
			secim2 = scanner.nextInt();

			switch (secim2) {
			case 1: {
				ucgenAlan();
				break;
			}
			case 2: {
				dortgenAlan();
				break;
			}
			case 0: {
				menu();
				break;
			}
			default:
				System.out.println("Lutfen Secenekler Arasinda Bir Tercih Yapiniz!");
				dortIslem();
				break;
			}
		} while (true);
	}

	public static void ucgenAlan() {
		System.out.println("Ucgenin yuksekligini giriniz");
		int h = scanner.nextInt();
		System.out.println("Ucgenin taban uzunlugunu giriniz");
		int t = scanner.nextInt();
		int sonuc = (h * t) / 2;
		System.out.println("Ucgenin alanı...:" + sonuc);

	}

	public static void dortgenAlan() {
		System.out.println("Dortgenin bir kenar uzunlugunu giriniz");
		int a = scanner.nextInt();
		System.out.println("Dortgenin ikinci kenar uzunlugunu giriniz");
		int b = scanner.nextInt();
		int sonuc = a * b;
		System.out.println("Dortgenin alanı...:" + sonuc);

	}

}
