import java.util.*;

public class Lab1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printl("Enter size of array:")

		int inputValue = in.nextInt();
		
		int size;
		
		if(inputValue <= 10)
			size = 10;
		else if(inputValue <= 100)
			size = 100;
		else if(inputValue <= 1000)
			size = 1000;
		else size = 10000;
		
		int testArray[] = new int[size];

		Random random = new Random();

		for(int i = 0; i < testArray.length; i++)
			testArray[i] = random.nextInt(100);
		
		System.out.println("BUBBLESORT ALG"); //O(n^2)
		
		for(int i: testArray)
			System.out.println(i);
		
		long startTime = System.nanoTime();
		bubblesort(testArray);
		long estimatedTime = System.nanoTime() - startTime;
		
		System.out.println("Sorted! Time:");
		System.out.println(estimatedTime);
		
		for(int i: testArray)
			System.out.println(i);
		
		for(int i = 0; i < testArray.length; i++)
			testArray[i] = random.nextInt(100);
		
		System.out.println("QUICKSORT ALG"); //O(n^2)
		
		for(int i: testArray)
			System.out.println(i);
		
		startTime = System.nanoTime();
		quicksort(testArray, 0, size - 1);
		estimatedTime = System.nanoTime() - startTime;
		
		System.out.println("Sorted! Time:");
		System.out.println(estimatedTime);
		
		for(int i: testArray)
			System.out.println(i);
		
		in.close();
	}
	
	static void swap(int[] arr, int i, int j) {
	    int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
	}
	 
	static void bubblesort(int[] arr) {
	    for(int i = arr.length-1 ; i >= 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	            if( arr[j] > arr[j+1] )
	               swap(arr, j, j+1);
	        }
	    }
	}
	
	static int partition (int[] array, int start, int end) {
	       int marker = start;
	       for( int i = start; i <= end; i++ ) 
	       {
	           if( array[i] <= array[end] ) 
	           {
	               int temp = array[marker]; // swap
	               array[marker] = array[i];
	               array[i] = temp;
	               marker += 1;
	           }
	       }
	       return marker - 1;
	   }
	 
	static void quicksort (int[] array, int start, int end) {
	       if( start >= end ) 
	           return;
	       int pivot = partition (array, start, end);
	       quicksort (array, start, pivot-1);
	       quicksort (array, pivot+1, end);
	   }

}
