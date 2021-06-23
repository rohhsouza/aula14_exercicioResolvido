package model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.OutsourcedEmployee;

public class Programl {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> Employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			
			System.out.print("Outsourced(y/n)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			sc.nextLine();
			switch(c) {
				case 'y':{
					System.out.print("Addicional charge: ");
					double addicional = sc.nextDouble();
					Employees.add(new OutsourcedEmployee(name,hours,value,addicional));
					break;
				}
				case 'n':{
					Employees.add(new Employee(name,hours,value));
					break;
				}
			}
		}
		
		for(Employee emp : Employees) {
			System.out.println(emp);
		}
		sc.close();
	}

}
