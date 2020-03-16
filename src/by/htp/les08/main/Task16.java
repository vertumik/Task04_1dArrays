//16. Даны действительные числа a1,a2,...,an . Найти
//max(a1 +a2n,a2 +a2n−1,...,an +an+1).

package by.htp.les08.main;

public class Task16 {

	public static void main(String[] args) {
		double max = Double.MIN_VALUE;
		int[] arr = {2, 4, 3, 5, 3, 1, 6, 8, 9, 7, 5, 6, 8, 3};
	    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
	        max = Double.max(max, arr[i] + arr[j]);
	    }
	    System.out.print(max);

	}

}
