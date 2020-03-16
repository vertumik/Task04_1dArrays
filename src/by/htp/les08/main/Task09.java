//9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package by.htp.les08.main;

public class Task09 {

	public static void main(String[] args) {
		int[] a = {4, 3, 6, 2, 7, 2, 3, 8, 5, 9, 1, 8};
		int max = a[0];
		int countMax = 0;
		int min = a[0];
		int countMin = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				countMax = i;
			}
			if (a[i] < min) {
				min = a[i];
				countMin = i;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			a[countMin] = max;
			a[countMax] = min;
			System.out.print(a[i]);
		}
		
		

	}

}
