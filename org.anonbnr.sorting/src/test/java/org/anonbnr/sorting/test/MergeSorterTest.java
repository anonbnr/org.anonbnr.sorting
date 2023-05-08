package org.anonbnr.sorting.test;

import org.anonbnr.sorting.MergeSorter;
import org.junit.jupiter.api.BeforeEach;

public class MergeSorterTest extends SorterTest {
	
	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new MergeSorter();
	}
}
