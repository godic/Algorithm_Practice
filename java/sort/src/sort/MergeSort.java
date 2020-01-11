package sort;

public class MergeSort {
	public MergeSort() {
	}
	
	public int[] run(int[] original, int low, int high) {
		int diff = high - low;
		int[] arr = new int[diff+1];
		int mid = (high + low)/ 2;
		
		//if((diff) % 2 != 0) mid += 0.5;
		
		if(diff == 0) {
			arr[0] = original[low];
		}
		else {
			int[] front = run(original, low, mid);
			int[] back = run(original, mid+1, high);
			int i = 0;
			int j = 0;
			for(int k = 0; k < diff + 1; k++) {
				if(front[i] < back[j]) {
					arr[k] = front[i++];
				}else {
					arr[k] = back[j++];
				}
				
				if(i == (mid - low + 1)) { // 0 1 2 3 4 5
					//Copy back
					for(int n = k + 1; n < diff + 1; n++) arr[n] = back[j++];
					
					break;
					
				}else if(j == (high - mid)){ // 5 6 7 8 9 10
					//Copy Front
					for(int n = k+1; n < diff + 1; n++) arr[n] = front[i++];
					
					break;
				}
			}
		}
		// return
		return arr;
	}
}
