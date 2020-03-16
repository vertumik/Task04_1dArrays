//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

package by.htp.les08.main;

public class Task02 {
	
	public static void main (String[] args) {
		int[] mas = {1, 2, 0, 4, 5, 0, 0, 6, 3};
		int count = 0;
		int j = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if ( mas[i] == 0) {
				count = count + 1;
			}
		}
		
		int[] index = new int [count];
    
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				index[j] = i;
				j++;
			}
		}
    
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		
		}
	}
}
