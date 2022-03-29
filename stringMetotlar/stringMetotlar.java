package stringMetotlari;

import java.util.Scanner;

public class stringMetotlar {
	public static void main (String []args) {
	Scanner input = new Scanner(System.in);
		
		String isim = "      Umut Mustafa  ";
		
		System.out.println(isim.length()); //karakter sayýsýný gösterir.
		
		String buyukIsým = isim.toUpperCase(); // yazýyý büyük harfe çevirir.
		
		String kucukIsým = isim.toLowerCase(); // yazýyý küçük harfe çevirir
		
		System.out.println(buyukIsým);
		
		System.out.println(kucukIsým);
		
		System.out.println(isim.trim()); //baþtaki ve sondaki boþluklarý siler, ortadakilere dokunmaz.
		
		System.out.println("----------------------------------------------------------------------------------");
		
		String ad = "Umut Mustafa";
		ad = ad.concat(" ");
		String soyad = "Çoban";
		String tamIsým = ad.concat(soyad.toUpperCase()); //sonuna ekleme yapýlacaðý zaman kullanýlýr (ad.concat)
		System.out.println(tamIsým);
	
		System.out.println("----------------------------------------------------------------------------------");
		
		
		String name = "Umut Mustafa";
		System.out.println(name.charAt(8)); //8. sýradaki harfi yazdýrýr.
		int indis = name.indexOf("M"); // M harfinin hangi sýrada oldugunu yazdýrýr.
		System.out.println(indis);
		
		
		System.out.println(name.substring(0,7)); // 0 ile 7. harflere kadar yazdýrýrç
		System.out.println(name.contains("Mustafa"));
		
		String isim2 = "Serpil Altun";
		System.out.println(isim2);
		isim2 = isim2.replace("Altun", "Çoban");
		System.out.println(isim2);
		
		
		String cumle = "Ne Mutlu Türküm Diyene!" ;
		
		String kelimeler [] = cumle.split(" ");
		System.out.println(kelimeler[0]);
		System.out.println(kelimeler[1]);
		System.out.println(kelimeler[2]);
		System.out.println(kelimeler[3]);
		
		
		
		
		
		}
	}


