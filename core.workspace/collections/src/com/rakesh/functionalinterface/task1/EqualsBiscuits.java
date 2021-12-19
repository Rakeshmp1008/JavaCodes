package com.rakesh.functionalinterface.task1;

import com.rakesh.functionalinterface.StringMatch;

public class EqualsBiscuits implements StringMatch {

	@Override
	public boolean evaluate(String ele, String value) {
		System.out.println("Invoking Equals Method");
		return ele.equals(value);
	}
}
