package Cozumler;

import java.util.Scanner;

public class soru11 {

	public static void main(String[] args) {
		/*
	    11----
	    Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.
	​
	    Test Data:
	    good
	​
	    Beklenen Çıktı:
	    goo
	    */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str1=scan.nextLine();
		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str1);
		sBuffer.deleteCharAt(str1.length()-1);
		System.out.println(sBuffer);
	}

}
