
package dizilerornek;

import java.util.Scanner;

public class dizilerornek {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		
		int sayilar [] = new int [10] ; //Girilen 10 tane say�n�n istenen de�erlerini bulma
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
	System.out.println("Dizinin toplam� : " + tumToplam);
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("�lk ve son de�erlerin toplam� : "+ilkSonToplam);
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("T�m say�lar�n toplam�n�n ilk ve son de�erlerin toplam�na oran� : " +oran );
	}

}
