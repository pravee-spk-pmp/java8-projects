/**
 * 
 */
package com.person.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.person.model.Person;

/**
 * @author praveenkumar
 *
 */
public class MainTest {

	List<Person> unsortedPersonList = Main.getPersonList();

	@Test
	public void getPersonListTest() {

		assertNotNull(unsortedPersonList);
		assertEquals(9, unsortedPersonList.size());
	}

	@Test
	public void sortByLocationTest() {
		assertNotNull(unsortedPersonList);
		assertEquals("Bangalore", Main.sortByLocation(unsortedPersonList).stream().findFirst().get().getLocation());
	}

	@Test
	public void fetchByAgeTest() {
		assertNotNull(unsortedPersonList);
		Assert.assertTrue(Main.fetchByAge(unsortedPersonList, 30).stream().findFirst().get().getAge() >= 30);
	}

	@Test
	public void fetchBySalaryTest() {
		assertNotNull(unsortedPersonList);
		Assert.assertTrue(
				Main.fetchBySalary(unsortedPersonList, 40000).stream().findFirst().get().getSalary() >= 40000);
	}

	@Test
	public void fetchByCriteriaTest() {
		assertNotNull(unsortedPersonList);
		List<Person> personsFilteredResults = Main.fetchByCriteria(unsortedPersonList, 35000, 30, "Bangalore",
				"Female");
		assertEquals(2, personsFilteredResults.size()); // Only 2 persons should meet this criteria Reena & Rekha
		assertEquals("Bangalore", personsFilteredResults.stream().findFirst().get().getLocation());
		assertEquals("Female", personsFilteredResults.stream().findFirst().get().getGender());
		Assert.assertTrue(personsFilteredResults.stream().findFirst().get().getSalary() >= 35000);
		Assert.assertTrue(personsFilteredResults.stream().findFirst().get().getAge() >= 30);
	}

}
