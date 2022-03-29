
public class OverloadingOrnek {
	public static void puanYazdir (String kullaniciAdi, int puan) {
		System.out.println(kullaniciAdi +"isimli kullanýcýnýn puaný : " +puan );
		
	}
	public static void puanYazdir (String kullaniciAdi) {
		System.out.println(kullaniciAdi +"isimli kullanýcýnýn puaný : 0 "  );
	}
	
	public static void puanYazdir (int puan) {
		System.out.println("Ýsimisiz kullanýcýnýn puaný : "+puan );
	}
	public static void puanYazdir () {
		System.out.println("Ýsimsiz kullanýcýnýn puaný : 0 ");
	}
	
	
	
	
	
	public static void main (String []args) {
		puanYazdir("fosforat ", 80);
		puanYazdir("fosforat");
		puanYazdir(65);
		puanYazdir();
	
	}
	
}
