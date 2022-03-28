package sinav1;

public class sinav2 {
public static void main (String[]args) {
	int[] list = {5,8,10,15,21,31,55,80};
	System.out.println(isSorted(list));
	
}





public static boolean isSorted(int[]list) {
	for (int i = 0; i < list.length -1; i++) {
		if(list[i]>=list[i+1]) {
				return false;
			}
		}
	
	return true;
}


//çalıştı :)
}
