import java.util.Arrays;

public class QuickSort {
	
	public static int  partition(int arr[] ,  int start,   int end) {
          
		int pivot = arr[start]; // pivot
		int  i = start;  // index of first element
                int  j = end;   //  index of last element
        
		while( i < j) {   // while i is less than  j
			// and while current [first] element is smaller or equals to pivot and index of that element is less than array length,
			while( arr[i] <= pivot && i < arr.length-1) {
				i++;    // increment i
			}  
			// while current [last] element is greater than pivot and index of that element is greater or equals to 0,
			 while(arr[j] > pivot && j >=0) {
				 j--; // decrement j 
			 }
		        // this following piece of code will exceute if the above two while loop conditions are false and while i < j
		     // if i is less than j 
		   // and if arr[i] is greater than pivot and arr[j] is less than pivot , then swap arr[i] with arr[j]
		    if(i < j) { 
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}   
		// when i becomes greater than j then,swap pivot element with current arr[j]
			int temp = arr[start];
			arr[start] = arr[j];
			arr[j] = temp;
		        return j; // return index of pivot
	}
	
	public static void RecursiveQuickSort(int arr[], int start, int end) {
		//This method is only invoked when we're processing arrays that have more than one element, 
		//hence the partitioning only takes place if start  <  end
		if(start < end) {
			//The partition(arr, start , end )partitions the array, 
			//and upon it's execution the variable index stores the index of the pivot element returned by the partition method
			int index = partition(arr, start,end);
			//Separately sort elements before partition and after partition
			RecursiveQuickSort(arr,start,index-1);
			RecursiveQuickSort(arr,index+1, end);
			
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr = {7,5, -4,9, 13, 3, 12,4}; // the array
		System.out.println("the original array is : " + Arrays.toString(arr)); // printing the original array
		RecursiveQuickSort(arr,0,arr.length-1); //  sorting the whole array
		System.out.println("the sorted array is ; " + Arrays.toString(arr)); // printing the sorted array
 
	}

}














