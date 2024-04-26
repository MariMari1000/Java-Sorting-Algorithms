package algorithms;
/*
 * source: https://www.javatpoint.com/insertion-sort-in-java
 */
public class InsertionSort {
	 public static void insertionSort(int numbersArray[]) {
		    int n = numbersArray.length;
		    for (int j = 1; j < n; j++) {
		      int key = numbersArray[j];
		      int i = j - 1;
		      while ((i > -1) && (numbersArray[i] > key)) {
		        numbersArray[i + 1] = numbersArray[i];
		        i--;
		      }
		      numbersArray[i + 1] = key;
		    }
		  }
}
