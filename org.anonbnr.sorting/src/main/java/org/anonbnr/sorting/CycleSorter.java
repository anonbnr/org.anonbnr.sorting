package org.anonbnr.sorting;

import java.util.List;

public class CycleSorter extends Sorter {
	
	public CycleSorter() {
		
	}
	
	public CycleSorter(List<Integer> subject){
		super(subject);
	}

	
	public void sort() {
		int element, position = 0, cycleStart = 0;
		
		for (; cycleStart < subject.size() - 1; cycleStart++) {
			element = subject.get(cycleStart);
			position = cycleStart;
			
			for (int i = cycleStart + 1; i < subject.size(); i++) {
				if (subject.get(i) < element)
					position++;
			}
			
			if (position == cycleStart)
				continue;
			
			while(element == subject.get(position))
				position++;
			
			if (position != cycleStart)
				element = swapValueWithListElement(element, position);
			
			while(position != cycleStart) {
				position = cycleStart;
				
				for (int i = cycleStart + 1; i < subject.size(); i++) {
					if (subject.get(i) < element)
						position++;
				}
				
				while(element == subject.get(position))
					position++;
				
				if (element != subject.get(position))
					element = swapValueWithListElement(element, position);
			}
		}
	}
	
	
	public int swapValueWithListElement(int element, int listIndex) {
		int temp = element;
		element = subject.get(listIndex);
		subject.set(listIndex, temp);
		
		return element;
	}
}
