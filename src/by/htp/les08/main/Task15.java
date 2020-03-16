//15. Дана последовательность действительных чисел a1,a2,...,an . 
//Указать те ее элементы, которые принадлежат отрезку [с, d].

package by.htp.les08.main;

public class Task15 {

	public static void main(String[] args) {
		double[] a = new double[25];
		int c = 5;
		int d = 11;
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.random();
			if ((i >= c) && (i <= d)) {
			System.out.println(a[i]);
			}
		}

	}

}
