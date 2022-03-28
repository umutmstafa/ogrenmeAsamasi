package sinav1;

public class sinav1 {
public static void main (String []args) {
int [] list = {3,8,5,7,9,15,25,61,39,31};
System.out.println(isUnique(list));
System.out.println(isSorted(list));

}


public static boolean isUnique(int[]list) {
	for (int i = 0; i < list.length; i++) {
		for (int j=i+1; j< list.length; j++) {
			if (list[i]==list[j]) {
				return false;
			}
		}
	}
	return true;
}


public static boolean isSorted(int[]list) {
	for (int i = 0; i < list.length -1; i++) {
		if(list[i]>=list[i+1]) {
				return false;
			}
		}
	
	return true;
}

public static int[][]matrixAdd(int[][]A, int[][]B) {
	int rows = A.length;
	int cols = B.length;
	if(rows > 0) {
		cols = A[0].length;
	}
	int[][] C = new int [rows][cols];
	
	for(int satir = 0; satir < rows; satir++) {
		for (int sutun = 0; sutun < cols; sutun++) {
			C[satir][sutun] = A[satir][sutun] + B[satir][sutun];
		}
	}

return C ;
}







}

