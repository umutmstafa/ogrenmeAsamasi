import java.util.Scanner;

public class songun {

	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int toplam = 0 ;
		int sayac = 0 ;
		
		System.out.println("Notu 0 - 100 aras?nda giriniz. (??kmak i?in notu -1 giriniz.) ");
		
		int not = input.nextInt();
		
		while (not != -1) {
			if (not >= 0 && not <= 100 ) {
				toplam = toplam + not;
				
			}
			else { System.out.println("Yanl?? not giri?i yap?ld?. " +not);
			
			}
			System.out.println("Notu 0 - 100 aras?nda giriniz. (??kmak i?in notu -1 giriniz.) ");
			
			not = input.nextInt();
		}
	}
	

}
