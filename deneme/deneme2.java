package deneme;

import java.util.Scanner;

public class deneme2 {
	
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.println("��renci notu giriniz");
		
		int ogrenciNo = input.nextInt();
		
		if (ogrenciNo>=60 ) {
			
			System.out.println("��renci notu olarak girilen de�er:"  + ogrenciNo);
			System.out.println("Ge�ti");
			
		}
		
		
		else System.out.println("Kald�");
	
	
	
	
	}
}

