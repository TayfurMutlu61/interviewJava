package Cozumler;
import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		/*
	    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
	​
	    Test Data
	    34
	    Beklenen Çıktı
	    7
	    */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int toplam=0;
		int rakam=0;
		
		
		while (sayi!=0) {
		rakam=	sayi%10;
		toplam+=rakam;
		sayi=sayi/10;
		}
		System.out.println("Girilen sayinin rakamalari toplami : "+toplam);

	}

}
