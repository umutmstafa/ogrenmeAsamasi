import java.util.Scanner;
public class Diziler {
	public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		String [] KizOgrenciler = {"Merve" , "Ay�e" , "Zeynep" , "�rem" , "Melike" , "Kadriye"} ;
		String [] ErkekOgrenciler = {"Umut" , "Tar�k" , "Furkan" , "�mer" , "Melih" , "��kr�"} ;
		int [] KizNotlar = {90 , 78 , 81 , 85 , 65 , 70};
		int [] ErkekNotlar = {100 , 66 , 54 , 87 , 44 , 50};
		//Merve'nin s�ras� 0 d�r. Kadriye'nin s�ras� 5 tir. (yani s�ralama 1 den de�il 0 dan ba�l�yor)
		//Ayn� s�ralama �ekli erkekler i�inde ge�erlidir...
		
		
		System.out.print("��rencinin s�ras�n� giriniz :");
		int ogrenciNo = input.nextInt() ;
				
		while (ogrenciNo == 0) {
			System.out.println(KizOgrenciler[0] +KizNotlar[0] );
			System.out.println(ErkekOgrenciler[0] +ErkekNotlar[0]);break ;} 
		while (ogrenciNo == 1) {
			System.out.println(KizOgrenciler[1] +KizNotlar[1] );
			System.out.println(ErkekOgrenciler[1] +ErkekNotlar[1]);break ;}
		
		while (ogrenciNo == 2) {
			System.out.println(KizOgrenciler[2] +KizNotlar[2] );
			System.out.println(ErkekOgrenciler[2] +ErkekNotlar[2]);break ;}
			
		while (ogrenciNo == 3) {
			System.out.println(KizOgrenciler[3] +KizNotlar[3] );
			System.out.println(ErkekOgrenciler[3] +ErkekNotlar[3]);break ;}
		
		while (ogrenciNo == 4) {
			System.out.println(KizOgrenciler[4] +KizNotlar[4] );
			System.out.println(ErkekOgrenciler[4] +ErkekNotlar[4]);break ;}
		
		while (ogrenciNo == 5) {
			System.out.println(KizOgrenciler[5] +KizNotlar[5] );
			System.out.println(ErkekOgrenciler[5] +ErkekNotlar[5]);break ;}
		}
		}
	


	
	
	
		
	
