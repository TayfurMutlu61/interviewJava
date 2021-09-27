package Cozumler;

import java.util.Scanner;

public class soru9 {

	public static void main(String[] args) {
		/*
	    9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.
	​
	    Test Data:
	    str1: Java is
	    str2: fun
	​
	    Beklenen Çıktı:
	    java is fun
	    */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str1=scan.nextLine();
		System.out.println("lutfen bir kelime daha giriniz");
		String str2=scan.nextLine();
		
		 String str3=str1+" "+str2;
		 System.out.println(str3);
	}

}
