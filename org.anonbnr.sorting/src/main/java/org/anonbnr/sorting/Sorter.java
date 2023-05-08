package org.anonbnr.sorting;

import java.util.ArrayList;
import java.util.List;

public abstract class Sorter {
	
	protected List<Integer> subject;
	
	public Sorter() {
		subject = new ArrayList<>();
	}
	
	public Sorter(List<Integer> subject) {
		this.subject = subject;
	}
	
	public List<Integer> getSubject(){
		return subject;
	}
	
	public void setSubject(List<Integer> subject) {
		this.subject = subject;
	}
	
	public void swap(int source, int target) {
		int sourceValue = subject.get(source);
		int targetValue = subject.get(target);
		subject.set(source, targetValue);
		subject.set(target, sourceValue);
	}
	
	public abstract void sort();
}
