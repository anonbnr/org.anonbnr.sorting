package org.anonbnr.sorting.test;

import org.anonbnr.sorting.BubbleSorter;
import org.junit.jupiter.api.BeforeEach;

public class BubbleSorterTest extends SorterTest {
	
	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new BubbleSorter();
	}
}
