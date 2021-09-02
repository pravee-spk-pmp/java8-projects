/**
 * 
 */
package com.person.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.person.model.Person;

/**
 * @author praveenkumar
 *
 */
public class Main {

	@SuppressWarnings("serial")
	/**
	 * Get a list of all the Persons
	 * 
	 * @return
	 */
	public static List<Person> getPersonList() {
		return new ArrayList<Person>() {
			{
				add(new Person(38, "Francis", "Chennai", "Male", 10000));
				add(new Person(40, "Akhil", "Bangalore", "Male", 42000));
				add(new Person(29, "Praveen", "Bangalore", "Male", 15000));
				add(new Person(31, "Venkat", "Hyderabad", "Male", 36500));
				add(new Person(31, "Reena", "Bangalore", "Female", 36000));
				add(new Person(23, "Michael", "Hyderabad", "Male", 37500));
				add(new Person(30, "Tony", "Chennai", "Male", 12000));
				add(new Person(45, "Modi", "Chennai", "Male", 45000));
				add(new Person(36, "Rekha", "Bangalore", "Female", 42000));

			}
		};
	}

	/**
	 * Sort by given Location in Ascending Order
	 * 
	 * @param personList
	 * @return
	 */
	public static List<Person> sortByLocation(List<Person> personList) {
		return personList.stream().sorted(Comparator.comparing(Person::getLocation)).collect(Collectors.toList());
	}

	/**
	 * Fetch Persons older/equal to given Age
	 * 
	 * @param personList
	 * @param age
	 * @return
	 */
	public static List<Person> fetchByAge(List<Person> personList, int age) {
		return personList.stream().filter(t -> t.getAge() >= age).collect(Collectors.toList());
	}

	/**
	 * Fetch Persons having salary equal/greater than given value
	 * 
	 * @param personList
	 * @param salary
	 * @return
	 */
	public static List<Person> fetchBySalary(List<Person> personList, int salary) {
		return personList.stream().filter(t -> t.getSalary() >= salary).collect(Collectors.toList());
	}

	/**
	 * Fetch Persons based on multiple Criteria for e.g. salary, age equal/greater
	 * than given value and belongs to specific gender and location
	 * 
	 * @param personList
	 * @param salary
	 * @param age
	 * @param location
	 * @param gender
	 * @return
	 */
	public static List<Person> fetchByCriteria(List<Person> personList, int salary, int age, String location,
			String gender) {
		return personList.stream().filter(t -> t.getSalary() >= salary & t.getAge() >= age
				& t.getLocation().equals(location) & t.getGender().equals(gender)).collect(Collectors.toList());
	}

	/**
	 * Main method / client / app to display person lists based on constraints
	 * specified accordingly
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("============================ List of all Persons ============================ \n");
		getPersonList().forEach(t -> System.out.println(t));

		System.out.println("\n======================== Persons sorted by Location ======================== \n");
		sortByLocation(getPersonList()).forEach(t -> System.out.println(t));

		System.out.println("\n============================ Persons Age >= 30 ============================= \n");
		fetchByAge(getPersonList(), 30).forEach(t -> System.out.println(t));

		System.out.println("\n============================ Persons Salary >= 35000 ======================= \n");
		fetchBySalary(getPersonList(), 35000).forEach(t -> System.out.println(t));

		System.out.println("\n===================== Persons Salary >= 35000 and Age >= 30 \n "
				+ "and Location = Bangalore and Gender = Female ============================= \n");
		fetchByCriteria(getPersonList(), 35000, 30, "Bangalore", "Female").forEach(t -> System.out.println(t));
	}

}
