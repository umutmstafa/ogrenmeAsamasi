
public class OverloadingOrnek {
	public static void puanYazdir (String kullaniciAdi, int puan) {
		System.out.println(kullaniciAdi +"isimli kullan�c�n�n puan� : " +puan );
		
	}
	public static void puanYazdir (String kullaniciAdi) {
		System.out.println(kullaniciAdi +"isimli kullan�c�n�n puan� : 0 "  );
	}
	
	public static void puanYazdir (int puan) {
		System.out.println("�simisiz kullan�c�n�n puan� : "+puan );
	}
	public static void puanYazdir () {
		System.out.println("�simsiz kullan�c�n�n puan� : 0 ");
	}
	
	
	
	
	
	public static void main (String []args) {
		puanYazdir("fosforat ", 80);
		puanYazdir("fosforat");
		puanYazdir(65);
		puanYazdir();
	
	}
	
}
