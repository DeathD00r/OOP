package com.luxoft.training.lab2;
import com.luxoft.training.lab2.employees.*;
import com.luxoft.training.utils.*;

public class PaymentCalcDemo{

	public static void main(String[] args){
		Employees[] arr_employees = new Employees[4];
		arr_employees[0] = new Monthly("Vasya", "Pupkin", "bookkeeper in department Finance Department",
		new Date(1, 4, 1974), 3000.0);
		arr_employees[1] = new Hourly("Alex", "Wayne", "tester in department IT Department",
		new Date(13,12, 1991), 12.0, 100.0);
		arr_employees[2] = new Comission("Maria", "Johnson", "director in department IT Department",
		new Date(18,6, 1976), 12.0, 10000.0); 
		arr_employees[3] = new BaseComission("Alexia", "Fast", "manager in department Finance Department",
		new Date(29,7, 1990), 10.0, 20000.0, 5000.0);
		
		Utils.sort(arr_employees, 0, 3);
		
		for(Employees emp: arr_employees)
			System.out.println(emp.get_information() );
	}

}