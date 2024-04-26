package algorithms;
public class CountingSort {
	 /*
	   * source: https://www.javatpoint.com/counting-sort
	   * Method will return maximum number from array
	   */
	  private static int getMax(int[] a, int n) {
	    int max = a[0];
	    for (int i = 1; i < n; i++) {
	      if (a[i] > max) max = a[i];
	    }
	    return max;
	  }
	  
	  public static void countingSort(int[] numbersArray) {
	    int numbersArrayLength = numbersArray.length;
	    int[] output = new int[numbersArrayLength + 1];
	    // Get the biggest number in the array
	    int max = getMax(numbersArray, numbersArrayLength);
	    int[] count = new int[max + 1]; // create count array with size [max+1]

	    // Set all values of count array to zero
	    for (int i = 0; i <= max; ++i) {
	      count[i] = 0;
	    }

	    // Store the count of every  element
	    for (int i = 0; i < numbersArrayLength; i++) {
	      count[numbersArray[i]]++;
	    }

	    // find cumulative frequency
	    for (int i = 1; i <= max; i++) count[i] += count[i - 1];

	    /* This loop will find the index of each element of the original array in count array, and
	    place the elements in output array
	    */
	    for (int i = numbersArrayLength - 1; i >= 0; i--) {
	      output[count[numbersArray[i]] - 1] = numbersArray[i];
	      count[numbersArray[i]]--;
	    }
	    // store the sorted elements into main array
	    for (int i = 0; i < numbersArrayLength; i++) {
	      numbersArray[i] = output[i];
	    }
	  }
}
