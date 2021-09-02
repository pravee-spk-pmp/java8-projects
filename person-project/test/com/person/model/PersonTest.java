/**
 * 
 */
package com.person.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author praveenkumar
 *
 */
public class PersonTest {

	private int age = 38, salary = 10000;
	private String name = "Francis", location = "Chennai", gender = "Male";
	private Person person = new Person(age, name, location, gender, salary);

	@Test
	public void toStringTest() {
		assertEquals("Person [age=38, name=Francis, location=Chennai, gender=Male, salary=10000]", person.toString());
	}

	@Test
	public void getterTest() {
		assertEquals(age, person.getAge());
		assertEquals(name, person.getName());
		assertEquals(location, person.getLocation());
		assertEquals(gender, person.getGender());
		assertEquals(salary, person.getSalary());
	}
}
