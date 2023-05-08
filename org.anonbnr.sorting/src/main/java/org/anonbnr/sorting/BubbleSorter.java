package org.anonbnr.sorting;

import java.util.List;

public class BubbleSorter extends Sorter {
	
	public BubbleSorter() {
		
	}
	
	public BubbleSorter(List<Integer> subject) {
		super(subject);
	}

	
	public void sort() {
		boolean isSorted;
		
		do {
			isSorted = true;
			for (int i = 0; i < subject.size() - 1; i++) {
				if (subject.get(i) > subject.get(i + 1)) {
					swap(i, i + 1);
					isSorted = false;
				}
			}
		} while(!isSorted);
	}
}
