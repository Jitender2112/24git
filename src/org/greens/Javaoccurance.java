package org.greens;

import java.util.HashMap;

public class Javaoccurance {

	public static void main(String[] args) {

		String str = "Welcome to Java Course";

		HashMap<Character, Integer> Map = new HashMap<>();

		for (int i = str.length() - 1; i >= 0; i--) {

			if (Map.containsKey(str.charAt(i))) {

				int count = Map.get(str.charAt(i));
				Map.put(str.charAt(i), ++count);
			} else {
				Map.put(str.charAt(i), 1);
			}
		}
		System.out.println(Map);

	}
}
