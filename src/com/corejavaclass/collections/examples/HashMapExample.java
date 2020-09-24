package com.corejavaclass.collections.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//ctrl+shf+O --for import statements
public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		// based on equals and hashcode methods

		map.put(1, "Antony");

		map.put(1, "Sampath");

		map.put(2, "Vinayak");

		map.put(3, "Reddy");

		System.out.println("-----------------");
		System.out.println(map);

		for (Map.Entry<Integer, String> ref : map.entrySet()) {

			System.out.println(ref.getKey());

		}

		for (Map.Entry<Integer, String> ref : map.entrySet()) {

			System.out.println(ref.getValue());

		}

		for (Map.Entry<Integer, String> ref : map.entrySet()) {

			System.out.println("Key:" + ref.getKey() + " and " + "value :"
					+ ref.getValue());

		}

		System.out.println(map.keySet());

		for (Integer ref : map.keySet()) {
			System.out.println(map.get(ref));

		}

		System.out.println(map.values());

	}

}
