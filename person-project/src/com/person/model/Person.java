/**
 * 
 */
package com.person.model;

/**
 * @author praveenkumar
 *
 */
public class Person {

	private int age, salary;

	private String name, location, gender;

	public Person(int age, String name, String location, String gender, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.location = location;
		this.gender = gender;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", location=" + location + ", gender=" + gender + ", salary="
				+ salary + "]";
	}

}
