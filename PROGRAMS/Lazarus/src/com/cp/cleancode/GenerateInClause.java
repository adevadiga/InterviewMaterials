package com.cp.cleancode;

import java.util.List;

public class GenerateInClause {
	
	
	public static void main(String[] args)
	{
		boolean t = isExternalImage("http://www.dickssportinggoods.com/graphics/product_images/pDSP1-23978876v750.jpg?$PickList$");
		System.out.println(t);
	}

	private static boolean isExternalImage(String url) {
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;$]*[-a-zA-Z0-9+&@#/%=~_|$]";
		return url.matches(regex);
	}
	String prepareParameterizedInQuery(String columnName, List paramValues)
	{
        StringBuilder inClauseQuery = new StringBuilder();	
		inClauseQuery.append(" ( ").append(columnName).append(" IN (");
		int size = paramValues.size();
		for(int i=0; i<size; i++)
		{
			if (i >= 999)
			{
				inClauseQuery.append(" ) OR ").append(columnName).append(" IN (");
			}
			
			inClauseQuery.append(" ?,");
		}
		inClauseQuery.setLength(inClauseQuery.length()-1);
		inClauseQuery.append(") )");
		return inClauseQuery.toString();
	}
}
