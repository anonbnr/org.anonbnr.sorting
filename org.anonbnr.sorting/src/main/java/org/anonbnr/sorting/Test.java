package org.anonbnr.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		List<Integer> subject = generateRandomList(7, 1, 10);
		Sorter sorter = new CycleSorter(subject);
		
		System.out.println("Before sorting: " + subject);
		sorter.sort();
		System.out.println("After sorting: " + subject);
	}
	
	public static List<Integer> generateRandomList(int size, int min, int max) {
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
