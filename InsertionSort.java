
public class InsertionSort implements SortingAlgorithm{

	public InsertionSort() {}
	
	public void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				int temp = arr[i];
				int j = i;
				while (j > 0 && arr[j - 1] > temp) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		InsertionSort bs = new InsertionSort();
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
		
		bs.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}	
	
