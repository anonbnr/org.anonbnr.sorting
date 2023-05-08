package org.anonbnr.sorting.test;

import org.anonbnr.sorting.SelectionSorter;
import org.junit.jupiter.api.BeforeEach;

public class SelectionSorterTest extends SorterTest {

	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new SelectionSorter();
	}

}
