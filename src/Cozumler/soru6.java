package Cozumler;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		/*
		​
		     6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
		           değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
		            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
		​
		    Sesli harfler: a,e,i,o,u
		​
		    Test Data:
		    a
		​
		    Beklenen Çıktı:
		    a harfi sesli harfdir.
		​
		    Test Data:
		    d
		​
		    Beklenen Çıktı:
		    d harfi sesiz harftir.
		​
		    Test Data:
		    we  yada %
		​
		    Beklenen Çıktı:
		    Yanlis karakter girdiniz!
		      */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
		String harf=scan.next();

		if (harf.length() == 1 && ((harf.charAt(0) >= 'A' && harf.charAt(0) <= 'Z') || (harf.charAt(0) >= 'a' && harf.charAt(0) <= 'z'))) {
			switch (harf.toLowerCase()) {
				case "a":
					System.out.println(harf + " bit sesli harftir");

					break;
				case "e":
					System.out.println(harf + " bit sesli harftir");
					break;
				case "i":
					System.out.println(harf + " bit sesli harftir");
					break;
				case "o":
					System.out.println(harf + " bit sesli harftir");
					break;
				case "u":
					System.out.println(harf + " bit sesli harftir");
					break;

				default:
					System.out.println(harf + " sessiz bir harftir");
					break;
			}
		} else {
			System.out.println("girdiginiz bir harf degildir veya birdfen fazla karakter girdiniz lutfen bir harf giriniz");
		}



	}

}
