package com.vishram.questions;

import java.util.ArrayList;
import java.util.List;

public class GenricsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls = new ArrayList<String>();
		List ls2 = ls;
		ls2.add(43);
		System.out.println(ls2.get(0));
	}

}
