package Cozumler;

import java.util.Scanner;

public class soru {

	public static void main(String[] args) {
		/*
		 7-----
       Ugly Number:
​
    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
​
​
    Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
​
    Test Data:
    13
​
    Beklenen çıktı:
    ugly number  degildir
​
    Test Data:
    25
    Beklenen Çıktı:
​
    ugly number*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		while (sayi!=1) {
			if (sayi%2==0) {
				sayi/=2;
			}else if (sayi%3==0) {
				sayi/=3;
			}else if (sayi%5==0) {
				sayi/=5;
			}else {
				System.out.println("grilen sayi ugly bir sayi degildir");
				break;
			}
			if (sayi==1) {
				System.out.println("girilen sayi ugly bir sayidir");
		
			}
		}
		
		
	}

}
