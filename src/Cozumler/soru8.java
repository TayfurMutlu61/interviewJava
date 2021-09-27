package Cozumler;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		/*
	    8----
	     Girilen String değerde tersten yazan Java kodunu yazınız.
	​
	    Test Data:
	    java
	    avaj
	    */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String kelime =scan.next();
		
		for (int i = kelime.length()-1 ; i >=0 ; i--) {
			System.out.print(kelime.charAt(i));
		}

	}

}
