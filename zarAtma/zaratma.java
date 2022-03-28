package zaratma;

import java.util.*;
public class zaratma {
	public static void main (String [] args ) {
		Random rand = new Random();
		int deneme = 0 ;
		int toplam = 0 ;
		while (toplam != 7) {
			int sayi1 = rand.nextInt(6)+1;
			int sayi2 = rand.nextInt(6)+1;
			toplam = sayi1 + sayi2;
			System.out.println(sayi1 + "+" +sayi2 +"=" +toplam);
			deneme++;
			
		}
		System.out.println("Tebrikler. " +deneme +". denemede bulundu.");
	}
}