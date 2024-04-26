package algorithms;

/*
 * source: https://www.baeldung.com/java-merge-sort
 */

public class MergeSort {
	// numbersArrayLength is array length
	  public static void mergeSort(int[] numbersArray, int numbersArrayLength) {
	    if (numbersArrayLength < 2) {
	      return;
	    }
	    int mid = numbersArrayLength / 2;
	    int[] l = new int[mid];
	    int[] r = new int[numbersArrayLength - mid];

	    System.arraycopy(numbersArray, 0, l, 0, mid);
	    if (numbersArrayLength - mid >= 0)
	      System.arraycopy(numbersArray, mid, r, 0, numbersArrayLength - mid);
	    mergeSort(l, mid);
	    mergeSort(r, numbersArrayLength - mid);

	    merge(numbersArray, l, r, mid, numbersArrayLength - mid);
	  }

	  private static void merge(int[] a, int[] l, int[] r, int left, int right) {

	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	      if (l[i] <= r[j]) {
	        a[k++] = l[i++];
	      } else {
	        a[k++] = r[j++];
	      }
	    }
	    while (i < left) {
	      a[k++] = l[i++];
	    }
	    while (j < right) {
	      a[k++] = r[j++];
	    }
	  }
}
