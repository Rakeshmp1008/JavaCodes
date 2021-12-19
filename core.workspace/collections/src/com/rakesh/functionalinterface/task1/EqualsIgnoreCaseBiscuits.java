package com.rakesh.functionalinterface.task1;

import com.rakesh.functionalinterface.StringMatch;

public class EqualsIgnoreCaseBiscuits implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking EqualsIgnoreCase method");
		return ele.equalsIgnoreCase(value);
	}

}
