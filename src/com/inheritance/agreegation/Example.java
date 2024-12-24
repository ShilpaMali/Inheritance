package com.inheritance.agreegation;

import java.util.Scanner;

public class Example {
	public void getEmployeeAddressInfo() {
		// id,firstname,lastname
		System.out.println("Enter employee ID>>");
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();
		System.out.println("Enter employee first name>>");
		String empFirstName = scanner.next();
		System.out.println("Enter employee last name>>");
		String empLastName = scanner.next();
		// addressLine,city,state,country
		System.out.println("Enter the address line>>");
		String addressLine = scanner.next();
		System.out.println("Enter the city>>");
		String addressCity = scanner.next();
		System.out.println("Enter the state>>");
		String addressState = scanner.next();
		System.out.println("Enter the country>>");
		String addressCountry = scanner.next();
		// How to set/store value into employee object
		Employee employee = new Employee();
		employee.setId(empId);
		employee.setFirstName(empFirstName);
		employee.setLastName(empLastName);
		// How to set/store value into address object
		Address address = new Address();
		address.setAddressLine(addressLine);
		address.setCity(addressCity);
		address.setState(addressState);
		address.setCountry(addressCountry);
		employee.setAddress(address);

		System.out.println("Employee ID>>" + employee.getId());
		System.out.println("Employee First Name>>" + employee.getFirstName());
		System.out.println("Employee Last Name>>" + employee.getLastName());
		System.out.println("Address Line>>" + employee.getAddress().getAddressLine());
		System.out.println("Address city>>" + employee.getAddress().getCity());
		System.out.println("Address State>>" + employee.getAddress().getState());
		System.out.println("Address Country>>" + employee.getAddress().getCountry());
	}

	public static void main(String[] args) {

		Example example = new Example();
		example.getEmployeeAddressInfo();

	}

}
