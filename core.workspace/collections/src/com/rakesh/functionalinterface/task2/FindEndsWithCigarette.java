package com.rakesh.functionalinterface.task2;

import com.rakesh.functionalinterface.StringMatch;

public class FindEndsWithCigarette implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking EndsWith method");
		return ele.endsWith(value);
	}

}
