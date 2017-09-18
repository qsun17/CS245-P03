
public class MergeSort implements SortingAlgorithm{
	
    private int[] array;
    private int[] tempMergArr;
    private int length;

	public MergeSort() {}
	
	/*
	public void sort(int[] a, int[] top, int[] bot) {
		int top_index = 0;
		int bot_index = 0;
		int a_index = 0;
		while(top_index<top.length && bot_index<bot.length) {
			if(top[top_index] <= bot[bot_index]) {
				a[a_index++] = top[top_index++];
			}
			else {
				a[a_index++] = bot[bot_index++];
			}	
		}
		while(top_index<top.length) {
			a[a_index++] = top[top_index++];
		}
		while(bot_index<bot.length) {
			a[a_index++] = bot[bot_index++];
		}
	}
	*/
	
	
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
	public static void main(String[] args) {
		MergeSort bs = new MergeSort();
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
		
		bs.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
