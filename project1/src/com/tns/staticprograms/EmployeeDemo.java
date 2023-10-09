package com.tns.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee("Ashish",3129);
		System.out.println(ob);
		Employee companyName; // accessing the static variable using classname
		ob=new Employee("Adi",2931);
		System.out.println(ob);
		}

}
