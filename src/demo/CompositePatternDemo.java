package demo;

import classes.Employee;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee CEO = new Employee("Mugdha", "CEO", 30000);

		Employee headSales = new Employee("John", "Head Sales", 30000);
		Employee headMarketing = new Employee("Sara", "Head Marketing", 30000);

		CEO.add(headMarketing);
		CEO.add(headSales);

		Employee clerk1 = new Employee("Mark", "Marketing", 30000);
		Employee clerk2 = new Employee("Susan", "Marketing", 30000);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println("CEO is " + CEO.getName());

		for (Employee headEmployee : CEO.getSubordinates()) {

			System.out.println("Printing employees of " + headEmployee.getName());

			for (Employee employee : headEmployee.getSubordinates()) {

				System.out.println(employee);
			}

		}
	}
}
