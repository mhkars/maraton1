package com.soru2;

import java.util.Arrays;
import java.util.Scanner;

public class dizi {

	static int dizi[] = new int[0];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		boolean durum = true;
		while (durum) {
			System.out.println();
			System.out.println("**********************************************");
			System.out.println("***Dizide yapmak istediginiz islemi seciniz***");
			System.out.println("**********************************************");
			System.out.println("1- Ekle");
			System.out.println("2- Sil");
			System.out.println("3- Araya Ekle");
			System.out.println("4- Listele");
			System.out.println("0- CIKIS");
			int secim = scanner.nextInt();

			switch (secim) {
			case 1: {

				dizi = ekle(dizi);
				break;
			}
			case 2: {
				dizi = sil(dizi);
				break;
			}
			case 3: {
				dizi = arayaEkle(dizi);
				break;
			}
			case 4: {
				listele(dizi);
				break;
			}
			case 0: {
				durum = false;
				break;
			}
			default:
				System.out.println("Lutfen Secenekler Arasinda Bir Tercih Yapiniz!");

				break;
			}
		}

	}

	public static int[] ekle(int[] array) {

		int[] temp_array = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp_array[i] = array[i];
		}
		System.out.println("Eklemek istediginiz elamani giriniz");
		int eleman = scanner.nextInt();

		temp_array[array.length] = eleman;
		array = temp_array;
		return array;
	}

	public static int[] sil(int[] array) {
		int index = 0;
		int[] temp_array = new int[array.length - 1];
		System.out.println("Silmek istediginiz elamani giriniz");
		int eleman = scanner.nextInt();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != eleman) {
				temp_array[index] = array[i];
				index++;
			}
		}
		array = temp_array;
		return array;
	}

	public static int[] arayaEkle(int[] array) {
		System.out.println("Eklemek istediginiz elamani giriniz");
		int eleman = scanner.nextInt();
		System.out.println("Eklemek istediginiz sirayi giriniz");
		int sira = scanner.nextInt();

		int[] temp_array = new int[array.length + 1];
		for (int i = 0; i < temp_array.length; i++) {
			if (i < sira) {
				temp_array[i] = array[i];
			} else if (i == sira) {
				temp_array[sira] = eleman;
			} else if (i > sira) {
				temp_array[i] = array[i - 1];
			}
		}
		array = temp_array;
		return array;
	}

	public static void listele(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}