package basamak;

import java.util.Scanner;

public class basamak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Bir sayý giriniz : ");
		int sayi = input.nextInt();
		sayi = Math.abs(sayi);
		int toplam = 0 ;
		
		while ( sayi > 0 ) {
			toplam = toplam + (sayi % 10);
			sayi = sayi / 10 ;
			
		}
		System.out.println("Toplam = " +toplam);
	}

}
