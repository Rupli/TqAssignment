package com.test9;

import java.util.ArrayList;
import java.util.HashMap;

public class QuetionnumFive {

	public static void findfrequencyofeachcharacter(ArrayList<Character> charlist) {
		HashMap<Character, Integer> charFreqMap = new HashMap<>();

		for (char c : charlist) {
			if (charFreqMap.containsKey(c)) {
				int freq = charFreqMap.get(c);
				charFreqMap.put(c, freq + 1);
			} else {
				charFreqMap.put(c, 1);
			}
		}

		System.out.println("Character frequency map: " + charFreqMap);
	}

	public static void main(String[] args) {
		ArrayList<Character> charl = new ArrayList<>();
		charl.add('a');
		charl.add('b');
		charl.add('a');
		charl.add('c');
		charl.add('a');
		charl.add('b');
		findfrequencyofeachcharacter(charl);

	}
}
