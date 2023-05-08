package org.anonbnr.sorting.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.anonbnr.sorting.Sorter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class SorterTest {
	
	protected Sorter sorter;
	protected List<Integer> subject;
	
	@BeforeEach
	public void setUp() throws Exception {
		subject = generateRandomList(20, 1, 100);
		System.out.println("List to sort: " + subject.toString());
	}
	
	@Test
	public void test() {
		System.out.println("Testing "+sorter.getClass().getName()+"...");
		sorter.setSubject(subject);
		sorter.sort();
		assertEquals(subject, subject.stream().sorted().collect(Collectors.toList()));
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("After sorting: " + subject.toString());
		System.out.println();
	}
	
	public List<Integer> generateRandomList(int size, int min, int max) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		int randomNumber;
		
		for (int i = 0; i < size; i++) {
			randomNumber = random.ints(min, max).findFirst().getAsInt();
			list.add(randomNumber);
		}
		
		return list;
	}

}
