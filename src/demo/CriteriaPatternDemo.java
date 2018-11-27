package demo;

import java.util.ArrayList;
import java.util.List;

import classes.AndCriteria;
import classes.CriteriaFemale;
import classes.CriteriaMale;
import classes.CriteriaSingle;
import classes.OrCriteria;
import classes.Person;
import interfaces.Criteria;

public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Ram", "male", "Single"));
		persons.add(new Person("John", "male", "Married"));
		persons.add(new Person("Laura", "female", "Married"));
		persons.add(new Person("Diana", "female", "single"));
		persons.add(new Person("Mike", "male", "Single"));
		persons.add(new Person("Etna", "female", "Single"));
		System.out.println("Person: "+persons.size());

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		System.out.println("Males:");
		printPersons(male.meetCriteria(persons));

		System.out.println("Females:");
		printPersons(female.meetCriteria(persons));

		System.out.println("Single Males:");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("Single or females:");
		printPersons(singleOrFemale.meetCriteria(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Person:[Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", MaritalStatus : " + person.getMaritalStatus() + "]");

		}
	}
}
