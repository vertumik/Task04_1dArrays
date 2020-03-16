//11. Даны натуральные числа а1 ,а2 ,..., аn. 
//Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).

package by.htp.les08.main;

public class Task11 {

	public static void main(String[] args) {
		int[] a = {4, 3, 6, 2, 7, 2, 3, 8, 6, 9, 1, 18};
		int m = 4;
		int l = 2;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % m == l){
				System.out.println(a[i]);
			}
		}

	}

}
