//10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package by.htp.les08.main;

public class Task10 {

	public static void main(String[] args) {
		int[] a = {4, 3, 6, 2, 7, 2, 3, 8, 5, 9, 1, 8};
		for (int i = 0; i < a.length; i++){
			if (a[i] > i) {
				System.out.print(a[i]);
			}
		}

	}

}
