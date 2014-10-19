package com.luxoft.training.lab2.employees;
import com.luxoft.training.utils.*;
public class Comission extends Employees{
	
	public double comission;
	public double sales_amount;
	public String payment_type;
	
	public Comission(String first_name, String last_name, String position, Date date,
	double comission, double sales_amount){
		super(first_name, last_name, position, date);
		this.payment_type = "comission";
		this.comission = comission;
		this.sales_amount = sales_amount;
		recalculate_payment();
	}
	
	public double recalculate_payment(){
		this.payment = sales_amount * (comission / 100);
		return this.payment;
	}
	
	public String get_information(){
		String information = get_information_base();
		information += "\npayment type: " + payment_type + "\ncomission: " + comission + "\nsales amount: " + sales_amount + "\npayment: " +
		this.payment;
		return information;
	}
}