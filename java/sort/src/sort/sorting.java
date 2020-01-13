package sort;

import sort.MergeSort;
import sort.QuickSort;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 67, 7, 9, 2 ,98, 1};
		
		MergeSort mergeSort = new MergeSort();
		int [] m_result = mergeSort.run(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(m_result[i]);
		}
		
		QuickSort quickSort= new QuickSort();
		int[] q_result = quickSort.run(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(q_result[i]);
		}
	}

}
