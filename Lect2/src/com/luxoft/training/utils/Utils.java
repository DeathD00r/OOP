package com.luxoft.training.utils;
import com.luxoft.training.lab2.employees.*;

public class Utils{
	
	public static int partition(Employees[] array, int start, int end){
		int marker = start;
		for (int i = start; i <= end; i++){
			if((int)(array[i].last_name.charAt(0)) <= (int)(array[end].last_name.charAt(0))){
				Employees temp = array[marker];
				array[marker] = array[i];
				array[i] = temp;
				marker += 1;
			}
		}
		return marker - 1;
   }
 
	public static void sort (Employees[] array, int start, int end){
		if (start >= end){
			return;
		}
        int pivot = partition (array, start, end);
        sort (array, start, pivot-1);
        sort (array, pivot+1, end);
   }

}