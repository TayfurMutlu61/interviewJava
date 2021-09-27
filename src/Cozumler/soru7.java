 package Cozumler;

import java.util.Scanner;

public class soru7 {

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
	    ugly number
	     */
		
	        Scanner scan = new Scanner(System.in); 
	        System.out.print("lutfen bir sayi giriniz ");
	       
	        int sayi = scan.nextInt();
	        uglyNumberSorgulama(sayi);
	    }
	    
	    public static void uglyNumberSorgulama(int sayi)
	    {
	        int num = sayi;
	       
	        while(num != 1)
	        {
	            if (num % 2 == 0)
	                num /= 2;
	            else if (num % 3 == 0)
	                num /= 3;
	            else if (num % 5 == 0)
	                num /= 5;    
	            else
	            {
	                System.out.println(sayi + " bir Ugly Number degildir");
	               
	                return;
	            }    
	        }
	        System.out.println(sayi + " bir Ugly Number dir");
	}

}
