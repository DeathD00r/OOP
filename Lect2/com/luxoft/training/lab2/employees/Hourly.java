package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;
public class Hourly extends Employees{
	
	public double hourly_rate;
	public double working_hours;
	public String payment_type;
	
	public Hourly(String first_name, String last_name, String position, Date date,
	double hourly_rate, double working_hours){
		super(first_name, last_name, position, date);
		this.payment_type = "hourly rate";
		this.hourly_rate = hourly_rate;
		this.working_hours = working_hours;
		recalculate_payment();
	}
	
	public double recalculate_payment(){
		this.payment = hourly_rate * working_hours;
		return this.payment;
	}
	
	public String get_information(){
		String information = get_information_base();
		information += "\npayment type: " + payment_type +  "\nhourly rate: " + hourly_rate + "\nworking hours: " + working_hours + "\npayment: " +
		this.payment;
		return information;
	}
}