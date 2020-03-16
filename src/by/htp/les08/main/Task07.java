//7. Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
//Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.


package by.htp.les08.main;

public class Task07 {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 5, 2, 5, 8, 6, 5, 7, 3, 5, 9, 8};
		int z = 4;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count += count;
			}
		}
		System.out.println("Количество замен = " + count);

	}

}
