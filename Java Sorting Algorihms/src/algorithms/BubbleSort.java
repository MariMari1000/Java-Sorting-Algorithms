package algorithms;

public class BubbleSort {
	/*
	   * source: https://www.javatpoint.com/bubble-sort-in-java
	   * takes an array of numbers
	   */
	  public static void bubbleSort(int[] numbersArray) {
	    int arrayLength = numbersArray.length;
	    int temp;
	    for (int i = 0; i < arrayLength; i++) {
	      for (int j = 1; j < (arrayLength - i); j++) {
	        if (numbersArray[j - 1] > numbersArray[j]) {
	          // If first number is bigger then the next number, they will be swapped
	          temp = numbersArray[j - 1];
	          numbersArray[j - 1] = numbersArray[j];
	          numbersArray[j] = temp;
	        }
	      }
	    }
	  }
}
