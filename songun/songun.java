import java.util.Scanner;

public class songun {

	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		int toplam = 0 ;
		int sayac = 0 ;
		
		System.out.println("Notu 0 - 100 arasýnda giriniz. (Çýkmak için notu -1 giriniz.) ");
		
		int not = input.nextInt();
		
		while (not != -1) {
			if (not >= 0 && not <= 100 ) {
				toplam = toplam + not;
				
			}
			else { System.out.println("Yanlýþ not giriþi yapýldý. " +not);
			
			}
			System.out.println("Notu 0 - 100 arasýnda giriniz. (Çýkmak için notu -1 giriniz.) ");
			
			not = input.nextInt();
		}
	}
	

}
