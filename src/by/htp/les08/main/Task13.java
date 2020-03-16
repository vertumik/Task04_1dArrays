//13. Определить количество элементов последовательности натуральных чисел, 
//кратных числу М и заключенных в промежутке от L до N.

package by.htp.les08.main;

public class Task13 {

	public static void main(String[] args) {
		int m = 4;
		int l = 2;
		int n = 7;
		int[] a = {3, 5, 2, 6, 7, 4, 6, 9, 2, 5, 8, 6, 7, 4, 2, 4};
		for (int i = 0; i < a.length; i++) {
			if ((i >= l) && (i <= n)) {
				if (a[i] % m == 0) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
