package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;
public class BaseComission extends Employees{
	
	public double comission;
	public double sales_amount;
	public double base_salary;
	public String payment_type;
	
	public BaseComission(String first_name, String last_name, String position, Date date,
	double comission, double sales_amount, double base_salary){
		super(first_name, last_name, position, date);
		this.payment_type = "comission and base salary";
		this.comission = comission;
		this.sales_amount = sales_amount;
		this.base_salary = base_salary;
		recalculate_payment();
	}
	
	public double recalculate_payment(){
		this.payment = base_salary + sales_amount * (comission / 100);
		return this.payment;
	}
	
	public String get_information(){
		String information = get_information_base();
		information += "\npayment type: " + payment_type +  "\ncomission: " + comission + "\nsales amount: " + sales_amount + "\nbase salary: " + 
		base_salary + "\npayment: " + this.payment;
		return information;
	}
}