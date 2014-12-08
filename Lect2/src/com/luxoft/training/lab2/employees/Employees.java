package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;

public abstract class Employees{
	public String first_name;
	public String last_name;
	public String position;
	public Date date;
	public double payment;
	
	public Employees(String first_name, String last_name, String position, Date date){
		this.first_name = first_name;
		this.last_name = last_name;
		this.position = position;
		this.date = date;
	}
	
	public abstract double recalculate_payment();
	
	public String get_information_base(){
		String information;
		information = "first name: " + first_name + "\nlast name: " + last_name + "\nposition: " + position +
		"\ndate: " + date.toString();
		return information;
	}
	
	public abstract String get_information();
}