//14. Дан одномерный массив A[N]. Найти:
//max(a2,a4,...,a2k )+min(a1,a3,...,a2k+1)

package by.htp.les08.main;

public class Task14 {

	public static void main(String[] args) {
		int[] a = {3, 5, 2, 6, 7, 4, 6, 9, 2, 5, 8, 6, 7, 4, 2, 4};
		int max = a[0];
		int min = a[1];
		for (int i = 2; i < a.length;) {
			if (a[i] > max) max = a[i];
			i = i + 2;
		}
		for (int i = 1; i < a.length;) {
			if (a[i] < min) min = a[i];
			i = i + 2;
		}
		int sum = max + min;
		System.out.println(sum);
	}

}
