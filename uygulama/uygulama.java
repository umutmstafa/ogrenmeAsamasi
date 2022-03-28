package uygulama;
import java.util.*;
public class uygulama{
	public static void main(String [] args){
	int [] list = { 4,6,7,3,5,8,12,84,-6} ;
	System.out.println(isUnique (list));
	}
	
	
	public static  boolean isUnique (int [] list) {
		for ( int i = 0;  i < list.length; i++) {
			for (int j = i+1 ;  j < list.length; j++ ) {
				if (list [i] == list [j]) {
					
					return false;
				}
			}
		}
	return true;
	
	
	
	
	}
}
