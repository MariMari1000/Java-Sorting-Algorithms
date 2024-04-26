package MainMethod;

import static algorithms.BubbleSort.bubbleSort;
import static algorithms.CountingSort.countingSort;
import static algorithms.InsertionSort.insertionSort;
import static algorithms.MergeSort.mergeSort;
import static algorithms.SelectionSort.selectionSort;
import static util.ArrayUtil.randomArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	  public static void main(String[] args) {
		  
	    //number of runs for each algorithm
	    int runs = 10;
	    //sizes of random arrays used for creating average running time of each algorithm
	    int[] sizes = {
	      100000, 200000,300000,400000,500000
	    };
	    /*
	     * Map with Integer (size) as a key, and running time as a value
	     * used to save timing of each run, calculate average time and make output
	     * example:     Map<100, 0.500>;
	     */
	    Map<Integer, Double> bubbleSortTimings = new HashMap<>();
	    Map<Integer, Double> mergeSortTimings = new HashMap<>();
	    Map<Integer, Double> countingSortTimings = new HashMap<>();
	    Map<Integer, Double> selectionSortTimings = new HashMap<>();
	    Map<Integer, Double> insertionSortTimings = new HashMap<>();

	    // BubbleSort
	    /*
	     * for each array size, run times are measured 10 time and values are saved in arrayList
	     * after 10 runs the average run time is calculated
	     * average time for each size is printed
	     */
	    
	    //looping through each number in the sizes array
	    for (int size : sizes) {
	    	//initialize array list of double type
	      List<Double> elapsedMillisList = new ArrayList<>();
	      //looping for value of runs
	      for (int count = 0; count < runs; count++) {
	    	  //start measuring time
	        long startTime = System.nanoTime();
	        //run sorting algorithm (randomArray is in util/ArrayUtil.java
	        //after 10 runs are over,calculate average timing
	        bubbleSort(randomArray(size));
	        //stop measuring time
	        long endTime = System.nanoTime();
	        //calculating time elapsed
	        long timeElapsed = endTime - startTime;
	        //converting nanoseconds to milliseconds
	        // it is necessary to cast long to double to get correct elapsed time
	        double elapsedMillis = (double) timeElapsed / 1000000;
	        //add elapsedMillis to the list 
	        elapsedMillisList.add(elapsedMillis);
	      }
	      // calculate average timings
	      double average =
	          elapsedMillisList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	      // save average timings to map, use size as key, and average timing as value
	      bubbleSortTimings.put(size, average);
	      // print average timing for each size
	      System.out.println("BumbleSort average time for size " + size + " is: " + average);
	    }
	   
	    
// The process above is repeated for the rest of algorithms
	    
	    // MergeSort
	    /*
	     * for each array size, run times are measured 10 time and values are saved in arrayList
	     * after 10 runs the average run time is calculated
	     * average time for each size is printed
	     */
	  for (int size : sizes) {
	      List<Double> elapsedMillisList = new ArrayList<>();
	      for (int count = 0; count < runs; count++) {
	        long startTime = System.nanoTime();
	        int[] testArray = randomArray(size);
	        mergeSort(testArray, testArray.length);
	        long endTime = System.nanoTime();
	        long timeElapsed = endTime - startTime;
	        double elapsedMillis = (double) timeElapsed / 1000000;
	        elapsedMillisList.add(elapsedMillis);
	      }
	      double average =
	          elapsedMillisList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	      mergeSortTimings.put(size, average);
	      System.out.println("MergeSort average time for size " + size + " is: " + average);
	    }
	    // CountingSort
	    /*
	     * for each array size, run times are measured 10 time and values are saved in arrayList
	     * after 10 runs the average run time is calculated
	     * average time for each size is printed
	     */
	    for (int size : sizes) {
	      List<Double> elapsedMillisList = new ArrayList<>();
	      for (int count = 0; count < runs; count++) {
	        long startTime = System.nanoTime();
	        int[] testArray = randomArray(size);
	        countingSort(testArray);
	        long endTime = System.nanoTime();
	        long timeElapsed = endTime - startTime;
	        double elapsedMillis = (double) timeElapsed / 1000000;
	        elapsedMillisList.add(elapsedMillis);
	      }
	      double average =
	          elapsedMillisList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	      countingSortTimings.put(size, average);
	      System.out.println("CountingSort average time for size " + size + " is: " + average);
	    }

	    // SelectionSort
	    /*
	    * for each array size, run times are measured 10 time and values are saved in arrayList
	     * after 10 runs the average run time is calculated
	     * average time for each size is printed
	     */
	    for (int size : sizes) {
	      List<Double> elapsedMillisList = new ArrayList<>();
	      for (int count = 0; count < runs; count++) {
	        long startTime = System.nanoTime();
	        int[] testArray = randomArray(size);
	        selectionSort(testArray);
	        long endTime = System.nanoTime();
	        long timeElapsed = endTime - startTime;
	        double elapsedMillis = (double) timeElapsed / 1000000;
	        elapsedMillisList.add(elapsedMillis);
	      }
	      double average =
	          elapsedMillisList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	      selectionSortTimings.put(size, average);
	      System.out.println("SelectionSort average time for size " + size + " is: " + average);
	    }

	    // InsertionSort
	    /*
	     * for each array size, run times are measured 10 time and values are saved in arrayList
	     * after 10 runs the average run time is calculated
	     * average time for each size is printed
	     */
	    for (int size : sizes) {
	      List<Double> elapsedMillisList = new ArrayList<>();
	      for (int count = 0; count < runs; count++) {
	        long startTime = System.nanoTime();
	        int[] testArray = randomArray(size);
	        insertionSort(testArray);
	        long endTime = System.nanoTime();
	        long timeElapsed = endTime - startTime;
	        double elapsedMillis = (double) timeElapsed / 1000000;
	        elapsedMillisList.add(elapsedMillis);
	      }
	      double average =
	          elapsedMillisList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
	      insertionSortTimings.put(size, average);
	      System.out.println("InsertionSort average time for size " + size + " is: " + average);
	    }

	    //Formatting table with average run times as console output
	    System.out.println();
	    formatSizes(sizes);
	   formatTimings(bubbleSortTimings, "Bubble Sort");
	   formatTimings(mergeSortTimings, "Merge Sort");
	   formatTimings(countingSortTimings, "Counting Sort");
	    formatTimings(selectionSortTimings, "Selection Sort");
	    formatTimings(insertionSortTimings, "Insertion Sort");
	  }

	  // organizing first row in console table output
	  private static void formatSizes(int[] sizes) {
	    // % -> sign
	    // - -> align left
	    // 20 -> length
	    // s -> string
	    System.out.format("%-20s", "Size");
	    //    looping through each number in the sizes array
	    for (int i : sizes) {
	      // % -> sign
	      // - -> align left
	      // 10 -> length
	      // d -> number
	      // i -> number in the sizes array
	      System.out.format("%-10d", i);
	    }
	  }

	  // organizing formatting of average run times for each sort
	  private static void formatTimings(Map<Integer, Double> timings, String timingName) {
	    // using tree map because it will auto sort by key value (Integer) -> it will take the lowest
	    // number first
	    TreeMap<Integer, Double> sortedMap = new TreeMap<>(timings);
	    // new line
	    System.out.println();

	    System.out.format("%-20s", timingName);
	    for (double timing : sortedMap.values()) {
	      // .3 -> three decimals
	      // f -> decimal number / float
	      System.out.printf("%-10.3f", timing);
	    }
	  }
	}
