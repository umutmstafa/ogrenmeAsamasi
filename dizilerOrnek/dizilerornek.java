
package dizilerornek;

import java.util.Scanner;

public class dizilerornek {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		
		int sayilar [] = new int [10] ; //Girilen 10 tane sayýnýn istenen deðerlerini bulma
		int tumToplam = 0 ;
		int ilkSonToplam = 0 ;
		
	for (int i = 0; i < 10; i++ ) {
		System.out.println("Sayi giriniz : ");
		sayilar [i] = input.nextInt();
		tumToplam += sayilar[i];
		
	}
	ilkSonToplam += sayilar [0] + sayilar[9];
	double oran = tumToplam / ilkSonToplam;
	
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("Dizinin toplamý : " + tumToplam);
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("Ýlk ve son deðerlerin toplamý : "+ilkSonToplam);
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("Tüm sayýlarýn toplamýnýn ilk ve son deðerlerin toplamýna oraný : " +oran );
	}

}
