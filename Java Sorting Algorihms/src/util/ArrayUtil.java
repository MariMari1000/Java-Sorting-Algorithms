package util;

public class ArrayUtil {
	/*
	   * Method provided in the assignment
	   * it will create random array of n size with range of numbers 0-99
	   */
	  public static int[] randomArray(int n) {
	    int[] array = new int[n];
	    for (int i = 0; i < n; i++) {
	      array[i] = (int) (Math.random() * 100);
	    }
	    return array;
	  }
}
