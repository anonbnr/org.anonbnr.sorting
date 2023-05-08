package org.anonbnr.sorting;

import java.util.List;

public class CocktailShakerSorter extends Sorter {
	
	public CocktailShakerSorter() {

	}

	public CocktailShakerSorter(List<Integer> subject) {
		super(subject);
	}

	
	public void sort() {
		boolean isSorted; 
		int i;
		
		do {
			isSorted = true;
			for (i = 0; i < subject.size() - 1; i++) {
				if (subject.get(i) > subject.get(i + 1)) {
					swap(i, i + 1);
					isSorted = false;
				}
			}
			
			if (isSorted)
				break;
			
			for (; i > 1; i--) {
				if (subject.get(i - 1) > subject.get(i)) {
					swap(i, i - 1);
					isSorted = false;
				}
			}
			
		} while(!isSorted);
	}
}
