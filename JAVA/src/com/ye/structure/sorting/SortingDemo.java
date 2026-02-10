package com.ye.structure.sorting;

public class SortingDemo {

	static final int NUM_SCALE = 10000;
	
	public static void prepare(int A[]) {
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (NUM_SCALE * Math.random());
		}
	}
	
	static final int SIZE = 1000;
	
	public static void main(String[] args) {
		int[] A = new int[SIZE];
		prepare(A);
		Sorting s = new Sorting(A);
//		s.selectionSort();
//		s.bubbleSort();
//		s.insertionSort();
//		s.shellSort();
//		s.mergeSort();
		s.quickSort();
//		s.heapSort();
//		A = s.countingSort(NUM_SCALE);
//		s.radixSort();
//		s.bucketSort();
	}

}
