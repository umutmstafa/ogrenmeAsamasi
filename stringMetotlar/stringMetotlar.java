package stringMetotlari;

import java.util.Scanner;

public class stringMetotlar {
	public static void main (String []args) {
	Scanner input = new Scanner(System.in);
		
		String isim = "      Umut Mustafa  ";
		
		System.out.println(isim.length()); //karakter say�s�n� g�sterir.
		
		String buyukIs�m = isim.toUpperCase(); // yaz�y� b�y�k harfe �evirir.
		
		String kucukIs�m = isim.toLowerCase(); // yaz�y� k���k harfe �evirir
		
		System.out.println(buyukIs�m);
		
		System.out.println(kucukIs�m);
		
		System.out.println(isim.trim()); //ba�taki ve sondaki bo�luklar� siler, ortadakilere dokunmaz.
		
		System.out.println("----------------------------------------------------------------------------------");
		
		String ad = "Umut Mustafa";
		ad = ad.concat(" ");
		String soyad = "�oban";
		String tamIs�m = ad.concat(soyad.toUpperCase()); //sonuna ekleme yap�laca�� zaman kullan�l�r (ad.concat)
		System.out.println(tamIs�m);
	
		System.out.println("----------------------------------------------------------------------------------");
		
		
		String name = "Umut Mustafa";
		System.out.println(name.charAt(8)); //8. s�radaki harfi yazd�r�r.
		int indis = name.indexOf("M"); // M harfinin hangi s�rada oldugunu yazd�r�r.
		System.out.println(indis);
		
		
		System.out.println(name.substring(0,7)); // 0 ile 7. harflere kadar yazd�r�r�
		System.out.println(name.contains("Mustafa"));
		
		String isim2 = "Serpil Altun";
		System.out.println(isim2);
		isim2 = isim2.replace("Altun", "�oban");
		System.out.println(isim2);
		
		
		String cumle = "Ne Mutlu T�rk�m Diyene!" ;
		
		String kelimeler [] = cumle.split(" ");
		System.out.println(kelimeler[0]);
		System.out.println(kelimeler[1]);
		System.out.println(kelimeler[2]);
		System.out.println(kelimeler[3]);
		
		
		
		
		
		}
	}


