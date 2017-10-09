package com.mayur.trial.one;

import java.util.Arrays;
import java.util.List;

public class TrialOne {

	public static void main(String args[]) {

		List<String> list = Arrays
				.asList("Mayur", "Vikram", "Lokesh", "Akshay");
		list.sort((String s1, String s2) -> s2.compareTo(s1));
		list.forEach((item) -> System.out.println(item));
		list.forEach((item) -> {
			if (item.equals("Mayur")) {
				System.out.println("found");
			}
		});

		list.stream().filter(item -> item.contains("a"))
				.forEach(System.out::println);

	}
}
