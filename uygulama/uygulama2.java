package uygulama;
import java.util.*;
public class uygulama2 {
public static void main (String [] args) {
	double [] list = {6,8,11,25,35,44,51};
	System.out.println(isSorted(list));
}

public static boolean isSorted(double [] list) {
	for (int i = 0 ; i < list.length-1; i++) {
		if (list [i] > list [i+1]) {
			return false ;
		}
	}
	return true;
}


}
