package stringOrnek;

import java.util.*;

public class stringOrnek {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tc kimlik numaras�n� giriniz : ");
		String tcNo = input.nextLine();
		
		char sonHane = tcNo.charAt(10);
		
		switch (sonHane) {
		
		case '0' :
			System.out.println("Bursun yataca�� tarih : 01.01.2022");
			break;
			
		case '2' :
			System.out.println("Bursun yataca�� tarih : 02.01.2022");
			break;
			
		case '4' :
			System.out.println("Bursun yataca�� tarih : 03.01.2022");
			break;
			
		case '6' :
			System.out.println("Bursun yataca�� tarih : 04.01.2022");
			break;
			
		case '8' :
			System.out.println("Bursun yataca�� tarih : 05.01.2022");
			break;
			
			default :
				
				System.out.println("Bir Hata Olu�tu");
			break;
		
		}
		
		
		
	}

}
