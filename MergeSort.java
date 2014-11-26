/*
Algorithms Analysis
MergeSort Splitting the Array in three Parts

By Banga Dennis 
University of Nairobi.
*/


public class MergeSort {
	
	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]){
		
		int[] inputArr = {44,22,10,83,74,99,2,23,60,41, 3};
		System.out.println("Unsorted Array\n");
		
		for(int i:inputArr){
	    	System.out.print(i);
	    	System.out.print(" ");
	    }
		MergeSort mergeSorted = new MergeSort();
		mergeSorted.sort(inputArr);
		System.out.println("\nSorted Array\n");

		for(int i:inputArr){
	    	System.out.print(i);
	    	System.out.print(" ");
	    }
	    System.out.print("\n");

	}
	
	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		
		if (lowerIndex < higherIndex) {

			int middle= (higherIndex - lowerIndex) / 3;

			int middle2=middle*2;

			int oneThird= lowerIndex+middle;
			int twoThird= lowerIndex+middle2;
			
			doMergeSort(lowerIndex, oneThird);
			
			doMergeSort(oneThird + 1, twoThird);

			doMergeSort(twoThird + 1, higherIndex);

			mergeParts(lowerIndex, oneThird, twoThird, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int middle2, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int l= middle2+1;
		int k = lowerIndex;
		while (i <= middle && j <= middle2 && l <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j] && tempMergArr[i] <= tempMergArr[l]) {
				array[k] = tempMergArr[i];
				i++;
			} 
			else
				if(tempMergArr[j] <= tempMergArr[i] && tempMergArr[j] <= tempMergArr[l])
				{
					array[k] = tempMergArr[j];
					j++;
				}

			else
			if(tempMergArr[l] <= tempMergArr[i] && tempMergArr[l] <= tempMergArr[j]) {
				array[k] = tempMergArr[l];
				l++;
			}
			k++;
		}


		//for remaining two subarrays ...

		while (i <=middle && j<= middle2){

		if (tempMergArr[i] <=tempMergArr[j]){

			array[k] = tempMergArr[i];
			i++;
		}
		else{

			array[k] = tempMergArr[j];
			j++;

		}
		k++;

		}


		while (i <=middle && l<= higherIndex){

		if (tempMergArr[i] <=tempMergArr[l]){

			array[k] = tempMergArr[i];
			i++;
		}
		else{

			array[k] = tempMergArr[l];
			l++;

		}
		k++;

		}


		while (j <=middle2 && l<= higherIndex){

		if (tempMergArr[j] <=tempMergArr[l]){

			array[k] = tempMergArr[j];
			j++;
		}
		else{

			array[k] = tempMergArr[l];
			l++;

		}
		k++;

		}

		// Completes the merged array with the left over elements

		while (i <=middle){

			array[k] = tempMergArr[i];
			k++;
			i++;
		}

		while (j <=middle2){

			array[k] = tempMergArr[j];
			k++;
			j++;
		}


		while (l <=higherIndex){

			array[k] = tempMergArr[l];
			k++;
			l++;
		}


	}
}
