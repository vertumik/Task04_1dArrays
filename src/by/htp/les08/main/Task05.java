//5. Дана последовательность натуральных чисел а1 , а2 ,..., аn. 
//Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

package by.htp.les08.main;

public class Task05 {

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 3, 6, 7, 5, 1, 3};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count = count + 1;
			}
		}
		if (count == 0) {
			System.out.println("Четных чисел в массиве нет");
		}
		int[] index = new int [count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index[j] = i;
				System.out.println(index[j]);
				j++;
			}
		}
	}

}
