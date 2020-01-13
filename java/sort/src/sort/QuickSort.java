package sort;

public class QuickSort {
	public int[] run(int[] original, int low, int high) {
		int diff = high - low;
		int pivot = low;
		int[] arr = original;
		if(high > low){
			int tmp = 0;
			for(int i = low + 1; i < high + 1; i++) {
				if(arr[i] < arr[low]) {
					tmp = arr[i];
					arr[i] = arr[++pivot];
					arr[pivot] = tmp;
				}
			}
			tmp = arr[low];
			arr[low] = arr[pivot];
			arr[pivot] = tmp;

			int[] front = run(arr, low, pivot - 1);
			int[] back = run(arr, pivot + 1, high);
			
			for(int i = low; i < pivot; i++) {
				arr[i] = front[i];
			}
			
			arr[pivot] = original[pivot];
			
			for(int i = pivot + 1; i < high+1; i ++) {
				arr[i] = back[i];
			}
		}
		
		return arr;	
	}
}
