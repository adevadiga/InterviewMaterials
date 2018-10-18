package com.cp.cleancode;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GenerateInClauseTest {

	@Test
	public void test() {
		GenerateInClause generateInClause = new GenerateInClause();
		String cName = "item_id";
		String expected = " ( item_id IN (?,?,?) )";
		Integer[] itemIds = new Integer[]{100,101,102};
		List<Integer> cValues = Arrays.asList(itemIds);
		String query = generateInClause.prepareParameterizedInQuery(cName, cValues);
		Assert.assertTrue(expected.replaceAll("\\s+","").equalsIgnoreCase(query.replaceAll("\\s+","")));
	}

}
