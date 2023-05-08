package org.anonbnr.sorting;

import java.util.List;

public class SelectionSorter extends Sorter {
	
	public SelectionSorter() {
		
	}

	public SelectionSorter(List<Integer> subject) {
		super(subject);
	}

	
	public void sort() {
		int counterIndex = 0, minimumIndex = 0, 
				traversingIndex = counterIndex + 1;
		
		for (int i = counterIndex; i < subject.size() - 1; i++) {
			for (int j = traversingIndex; j < subject.size(); j++) {
				if (subject.get(j) < subject.get(minimumIndex))
					minimumIndex = j;
			}
			
			swap(counterIndex, minimumIndex);
			minimumIndex = ++counterIndex;
			traversingIndex = counterIndex + 1;
		}
	}
}
