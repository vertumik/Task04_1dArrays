//12. Задана последовательность N вещественных чисел. 
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

package by.htp.les08.main;

public class Task12 {

	public static void main(String[] args) {
		int[] a = {5, 5, 6, 1, 7, 2, 3, 8, 6, 5, 1, 18};
		int k = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					k++;
				}
				if (k == 2) {
					sum = sum + a[i];
				}
			}
		}
		System.out.println(sum);
	}

}
