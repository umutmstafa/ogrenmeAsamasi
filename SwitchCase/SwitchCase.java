package SwitchCase;
// 4 i�lem yapt�rma
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Birinci say�y� giriniz :");
	int sayi1 = input.nextInt();
	System.out.print("�kinci say�y� giriniz :");
	int sayi2 = input.nextInt();
		
	
	System.out.println("1 = Toplama");
	System.out.println("2 = ��kartma");
	System.out.println("3 = �arpma");
	System.out.println("4 = B�lme");

	System.out.print("��lem tipi :");	
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
		System.out.println("Hatal� bir say� girdiniz..!");
	    break ;
	    
	}
	}

}
