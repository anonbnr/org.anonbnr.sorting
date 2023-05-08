package org.anonbnr.sorting.test;

import org.anonbnr.sorting.CycleSorter;
import org.junit.jupiter.api.BeforeEach;

public class CycleSorterTest extends SorterTest {

	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new CycleSorter();
	}
}
