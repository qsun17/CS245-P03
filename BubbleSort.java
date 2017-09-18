
public class BubbleSort implements SortingAlgorithm{
	
	public BubbleSort() {}

	public void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] arr) {
		boolean swapped = true;
		for (int j = 0; j<arr.length&&swapped; j++) {
			swapped = false;
			for ( int i = 0; i<arr.length-1-j; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					swapped = true;
				}
			}
		}	
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
		
		bs.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
