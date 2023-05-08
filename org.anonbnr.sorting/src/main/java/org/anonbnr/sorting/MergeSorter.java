package org.anonbnr.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter extends Sorter {
	
	public MergeSorter() {
		
	}
	
	public MergeSorter(List<Integer> subject) {
		super(subject);
	}

	
	public void sort() {
		mergeSort(0, subject.size() - 1);
	}
	
	public void mergeSort(int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int middleIndex = (leftIndex + rightIndex) / 2;
			mergeSort(leftIndex, middleIndex);
			mergeSort(middleIndex + 1, rightIndex);
			merge(leftIndex, middleIndex, rightIndex);
		}
	}
	
	public void merge(int leftIndex, int middleIndex, int rightIndex) {
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		
		for (int i = leftIndex; i <= middleIndex; i++)
			leftList.add(subject.get(i));
		
		for (int i = middleIndex + 1; i <= rightIndex; i++)
			rightList.add(subject.get(i));
		
		int leftListSize = leftList.size(), rightListSize = rightList.size();
		int leftListIndex = 0, rightListIndex = 0, subjectIndex = 0;
		int leftElement, rightElement;
		
		while(leftListIndex < leftListSize && rightListIndex < rightListSize) {
			leftElement = leftList.get(leftListIndex);
			rightElement = rightList.get(rightListIndex);
			
			if (leftElement <= rightElement) {
				subject.set(subjectIndex+leftIndex, leftElement);
				leftListIndex++;
			}
			else {
				subject.set(subjectIndex+leftIndex, rightElement);
				rightListIndex++;
			}
			
			subjectIndex++;
		}
		
		while (leftListIndex < leftListSize) {
			leftElement = leftList.get(leftListIndex);
			subject.set(subjectIndex+leftIndex, leftElement);
			leftListIndex++;
			subjectIndex++;
		}
		
		while (rightListIndex < rightListSize) {
			rightElement = rightList.get(rightListIndex);
			subject.set(subjectIndex+leftIndex, rightElement);
			rightListIndex++;
			subjectIndex++;
		}
	}
}
