package com.luxoft.training.utils;

public class Date{

	public int day;
	public int month;
	public int year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString(){
		return String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year);
	}

}