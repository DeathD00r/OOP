package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;
public class Monthly extends Employees{
	
	public double salary;
	public String payment_type;
	
	public Monthly(String first_name, String last_name, String position, Date date,
	double salary){
		super(first_name, last_name, position, date);
		this.payment_type = "monthly salary";
		this.salary = salary;
		recalculate_payment();
	}
	
	public double recalculate_payment(){
		this.payment = salary;
		return this.payment;
	}
	
	public String get_information(){
		String information = get_information_base();
		information += "\npayment type: " + payment_type +  "\nsalary: " + salary + "\npayment: " + this.payment;
		return information;
	}
}