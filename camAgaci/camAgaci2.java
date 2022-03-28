package camAgaci;

public class camAgaci2 {
	
	public static void main (String [] args) {
		
		int bosluk,satir,sutun;
		
		for (satir = 1 ; satir < 6 ; satir++) {
			for (bosluk = satir ; bosluk < 6 ; bosluk++) {
				
			
			System.out.print(" ");
			
		}
		
		for (sutun = 1 ; sutun < satir ; sutun++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
	}
}
}