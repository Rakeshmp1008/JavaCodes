package com.rakesh;

import com.rakesh.overridemethods.Watch;

public class WatchScammer {

	public static void main(String[] args) {

		Watch watchRef=new Watch();
		System.out.println(watchRef.toString());
		System.out.println(watchRef.hashCode());
		System.out.println(System.identityHashCode(watchRef));
		watchRef.setBrand("SONATA");
		watchRef.setPrice(1000f);
		
		
		Watch watchRef1=new Watch();
		watchRef1.setBrand("SONATA");
		watchRef1.setPrice(1000f);
		
		System.out.println(watchRef.equals(watchRef1));
		

	}

}