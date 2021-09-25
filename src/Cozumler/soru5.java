package Cozumler;

public class soru5 {

	public static void main(String[] args) {
		/*
	    5-----Aþaðýdaki elmas deseni görüntüsünü çizen java kodunu yazýnýz.
	    Test Data:
	    Yarým elmas uzunluðu : 7
	    Beklenen Çýktý:
	          *
	         ***
	        *****
	       *******
	      *********
	     ***********
	    *************
	     ***********
	      *********
	       *******
	        *****
	         ***
	          *
	      */
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			
			System.out.println();
		}
	//////////////////////////////////////////////////////////////////
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<=7-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
		
			System.out.println();
		}
		

	}

}
