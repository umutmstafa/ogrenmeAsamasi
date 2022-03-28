
public class Overloading {

	
	public static void karesiniAl(int a) {
		int sonuc = a*a ;
		System.out.println(sonuc);

	}
	
	
	public static void karesiniAl(double a) {
		double  sonuc = a*a ;
		System.out.println(sonuc);
}
	
	public static void main(String []args) {
		karesiniAl (4);
		karesiniAl(16.5);
	}
	
}