package org.anonbnr.sorting.test;

import org.anonbnr.sorting.OddEvenSorter;
import org.junit.jupiter.api.BeforeEach;

public class OddEvenSorterTest extends SorterTest {

	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new OddEvenSorter();
	}
}
