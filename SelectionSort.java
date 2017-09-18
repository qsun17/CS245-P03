
public class SelectionSort implements SortingAlgorithm{
	
	public SelectionSort() {}
	
	public void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public int smallest(int[] arr, int start) {
		int smallest  = start;
		for(int i = start + 1; i < arr.length; i++) {
			if (arr[i] < arr[smallest]) {
				smallest = i;
			}	
		}	
		return smallest;
	}
	
	public void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = smallest(arr, i);
			swap(arr, smallest, i);
		}
	}
	
	public static void main(String[] args) {
		SelectionSort bs = new SelectionSort();
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
		
		bs.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
}
