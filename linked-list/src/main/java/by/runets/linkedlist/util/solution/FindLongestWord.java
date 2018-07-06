package by.runets.linkedlist.util.solution;

import java.util.*;

public class FindLongestWord {
	public String longestWord (String[] words) {
		Map<Integer, String> map = new HashMap<>();
		String frequent = findFrequentSymbol(words);
		for (String word : words) {
			if (frequent.equals(word.substring(0, 1))) {
				map.put(word.length(), word);
			}
		}
		return !map.entrySet().isEmpty() ? Collections
				.max(map.entrySet(), Map.Entry.comparingByKey())
				.getValue() : "";
	}
	
	public String findFrequentSymbol (String[] words) {
		Map<String, Integer> frequent = new HashMap<>(words.length);
		for (String word : words) {
			String character = word.substring(0, 1);
			if (frequent.get(character) != null) {
				int counter = frequent.get(character);
				frequent.put(character, ++counter);
			} else {
				frequent.put(character, 1);
			}
		}
		return !frequent.entrySet().isEmpty() ? Collections
				.max(frequent.entrySet(), Map.Entry.comparingByValue())
				.getKey() : "";
	}
	
	public static void main (String[] args) {
		String[] words = {"ogz","eyj","e","ey","hmn","v","hm","ogznkb","ogzn","hmnm","eyjuo","vuq","ogznk","og","eyjuoi","d"};
		System.out.println(new FindLongestWord().longestWord(words));
	}
}
