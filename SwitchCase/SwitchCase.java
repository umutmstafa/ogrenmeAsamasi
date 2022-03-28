package SwitchCase;
// 4 iþlem yaptýrma
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Birinci sayýyý giriniz :");
	int sayi1 = input.nextInt();
	System.out.print("Ýkinci sayýyý giriniz :");
	int sayi2 = input.nextInt();
		
	
	System.out.println("1 = Toplama");
	System.out.println("2 = Çýkartma");
	System.out.println("3 = Çarpma");
	System.out.println("4 = Bölme");

	System.out.print("Ýþlem tipi :");	
	int islem = input.nextInt();
	switch (islem) {
	case 1 :
		System.out.println(sayi1+sayi2);
		break ;
		
	case 2 :
		System.out.println(sayi1-sayi2);
	    break;
	
	case 3 :
		System.out.println(sayi1*sayi2);
		break ;
		
	case 4 :
		System.out.println(sayi1/sayi2);
		break ;
		
	default :
		System.out.println("Hatalý bir sayý girdiniz..!");
	    break ;
	    
	}
	}

}
