//17. Дана последовательность целых чисел a1,a2,...,an.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an).


package by.htp.les08.main;

public class Task17 {

	public static void main(String[] args) {
		int[] a = {2, 4, 3, 5, 2, 3, 7, 8, 2, 5, 3, 9};
		int min = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		int x = a.length;
		int[] b = new int[x];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				b[i] = a[i];
				System.out.println(b[i]);
			}
		}
		

	}

}
