package Cozumler;

import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		/*
	    10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.
	​
	    Test Data:
	    Java is easy
	​
	    Aranan String: is
	​
	    Bektenen Çıktı:
	    True
	​
	    Aranan String: and
	​
	    Beklenen Çıktı:False
	    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str1=scan.nextLine();
		System.out.println("lutfen bir kelime daha giriniz");
		String str2=scan.nextLine();
		
		System.out.println(str1.contains(str2));
	}

}
