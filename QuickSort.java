import java.util.Arrays;

public class QuickSort {
	
	public static int  partition(int arr[] ,  int low,   int high) {
          
		int pivot = arr[low]; // pivot
		int  i = low;     // index of  first element
        int  j = high;   // index of the last element
        
		while( i < j) {   // while index of i is less than index of j
			// and while current [first] element is smaller or equals to pivot and index of that element is less than array length,
			while( arr[i] <= pivot && i < arr.length-1) {
				i++;    // increment index of smaller element
			}  
			// while current [last] element is greater than pivot and index of that element is greater or equals to 0,
			 while(arr[j] > pivot && j >=0) {
				 j--; // decrement j 
			 }
		
		     // if index of i is less than index of j 
			 // and if arr[i] is greater than pivot and arr[j] is less than pivot , then swap arr[i] with arr[j]
		    if(i < j) { 
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}   
		// if index of i is greater or equals to index of j , then 
		// swap pivot element with arr[j]
		if(i >= j) {
			int temp = arr[low];
			arr[low] = arr[j];
			arr[j] = temp;
		
		}
		return j; // return index of pivot
	}
	
	public static void quickSort(int arr[], int low, int high) {
		// This method is only invoked when we're processing arrays that have more than one element, 
		//hence the partitioning only takes place if low < high.
		if(low < high) {
			// The partition(arr, low, high) method partitions the array, 
			//and upon it's execution the variable index stores the index of the pivot after the partitioning.
			int index = partition(arr, low, high);
			//Separately sort elements before partition and after partition
			quickSort(arr , low, index-1);
			quickSort(arr, index +1 , high);
			
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {7,5, -4,9, 13, 3, 12,4}; // the array
		System.out.println("the original array is : " + Arrays.toString(arr)); // printing the original array
		quickSort(arr, 0, arr.length-1); //  sorting the whole array
		
		System.out.println("the sorted array is ; " + Arrays.toString(arr)); // printing the sorted array
 
	}

}














