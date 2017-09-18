
public class QuickSort implements SortingAlgorithm{

	
	public QuickSort() {}
	
	public void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}
	
	public void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	public int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	
	public static void main(String[] args) {
		QuickSort bs = new QuickSort();
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
		
		bs.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
