package Cozumler;

public class soru5 {

	public static void main(String[] args) {
		/*
	    5-----A�a��daki elmas deseni g�r�nt�s�n� �izen java kodunu yaz�n�z.
	    Test Data:
	    Yar�m elmas uzunlu�u : 7
	    Beklenen ��kt�:
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
