import java.util.Scanner;

public class asalsayi {

	public static boolean asalKontrol (int sayi) {
	boolean sonuc = true ;
	for (int i = 2 ; i<sayi; i++) {
		if (sayi%i == 0) {
			sonuc = false ;
			break ;
		}
	
	}

	return sonuc ;
	}
	
	
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Bir say� giriniz : " );
		int a = input.nextInt();
		if(asalKontrol(a) == true ) {
			System.out.println("Say� asald�r");
		}
		else {
			System.out.println("Say� asal de�ildir");
		}
		
		
	}
}
