package com.practice.strings.arrays;

import java.util.HashSet;
import java.util.Set;

class Solution31 {
	Set<String> set = new HashSet<>();

	String[] getQueryStrings(String[] strs, String query) {
		if (query.isEmpty()) {
			return strs;
		}
		int queryLength = query.length();
		for (String str : strs) {
			if (str.substring(0, queryLength).equals(query)) {
				set.add(str);
			}
		}
		return (String[]) set.toArray(new String[0]);
	}
}

public class Autocomplete {
	public static void main(String args[]) {
		Solution31 sol = new Solution31();
		String[] result = sol.getQueryStrings(new String[]{"dog", "deer", "deal"}, "de");
		for(String str: result) {
			System.out.println(str);
		}
	}
}
