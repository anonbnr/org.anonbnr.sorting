package org.anonbnr.sorting.test;

import org.anonbnr.sorting.CocktailShakerSorter;
import org.junit.jupiter.api.BeforeEach;

public class CocktailShakerSorterTest extends SorterTest {

	@BeforeEach
	public void setUp() throws Exception {
		super.setUp();
		sorter = new CocktailShakerSorter();
	}
}
