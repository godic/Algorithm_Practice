package sort;

import sort.MergeSort;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 67, 7, 9, 2 ,98, 1};
		
		MergeSort mergesort = new MergeSort();
		int [] result = mergesort.run(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(result[i]);
		}
	}

}
