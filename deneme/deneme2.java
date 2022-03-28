package deneme;

import java.util.Scanner;

public class deneme2 {
	
	public static void main (String []args) {
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.println("Öðrenci notu giriniz");
		
		int ogrenciNo = input.nextInt();
		
		if (ogrenciNo>=60 ) {
			
			System.out.println("Öðrenci notu olarak girilen deðer:"  + ogrenciNo);
			System.out.println("Geçti");
			
		}
		
		
		else System.out.println("Kaldý");
	
	
	
	
	}
}

