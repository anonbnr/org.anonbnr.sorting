package org.anonbnr.sorting;

import java.util.List;

public class OddEvenSorter extends Sorter {
	
	public OddEvenSorter() {
		
	}

	public OddEvenSorter(List<Integer> subject) {
		super(subject);
	}

	
	public void sort() {
		boolean isSorted;
		
		do {
			isSorted = true;
			for (int i = 1; i < subject.size() - 1; i += 2) {
				if (subject.get(i) > subject.get(i + 1)) {
					swap(i, i + 1);
					isSorted = false;
				}
			}
			
			for (int i = 0; i < subject.size() - 1; i += 2) {
				if (subject.get(i) > subject.get(i + 1)) {
					swap(i, i + 1);
					isSorted = false;
				}
			}
			
		} while(!isSorted);
	}

}
