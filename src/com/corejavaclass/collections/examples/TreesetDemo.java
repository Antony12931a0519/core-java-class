package com.corejavaclass.collections.examples;

import java.util.*;

public class TreesetDemo {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		names.add("aamir");
		names.add("zamir");
		names.add("xamir");
		names.add("bamir");
		names.add("camir");
		System.out.println("non soreted:" + names);
		Set<String> set = new HashSet<String>();
		set.add("aamir");
		set.add("zamir");
		set.add("xamir");
		set.add("bamir");
		set.add("camir");
		System.out.println("Sorted:" + set);

	}

}
