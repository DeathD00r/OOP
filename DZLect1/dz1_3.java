import java.util.*;

public class dz1_3{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = scanner.nextInt();
		int array[] = new int[size];
		Random random = new Random();

		for(int i = 0; i < size; i++){
			array[i] = random.nextInt(20);
			System.out.println(array[i]);
		}
		System.out.println("Enter key:");
		int key = scanner.nextInt();
		System.out.println("Enter method 1 - linSearch, 2 - bSearch:");
		int method = scanner.nextInt();
		if(method == 1)
			System.out.println("position: " + linSearch(array, key)); //O(n) количество шагов зависит от расположения элемента
		//в массиве. Максимальное количество шагов будет равно размеру массива
		if(method == 2)
			System.out.println("position: " + bsearch(array, key, 0, array.length));
		//O(log(n)) количество шагов мало зависит от размера массива, так как большинство элементов просто не 
		//проверяются.
	}

	static int linSearch(int array[], int q){
		for(int i = 0; i < array.length; i++)
			if(array[i] == q)
				return i;
		return -1;
		}

	static int bsearch(int[] array, int key, int left, int right){
    	bubblesort(array);

    	int mid = left + (right - left) / 2;

    	if (array[mid] == key)
        	return mid;

    	else if (array[mid] > key)
        	return bsearch(array, key, left, mid);
    	else
        	return bsearch(array, key, mid + 1, right);
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
}