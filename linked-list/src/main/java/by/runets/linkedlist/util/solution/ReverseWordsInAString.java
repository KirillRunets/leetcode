package by.runets.linkedlist.util.solution;

public class ReverseWordsInAString {
	public String reverseWords(String s) {
	 	String[] words =  s.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < words.length - 1; i++) {
			stringBuilder.append(words[i]).reverse().append(" ");
		}
		return stringBuilder.toString();
	}
	
	public static void main (String[] args) {
		System.out.println(		new ReverseWordsInAString().reverseWords("Let's take LeetCode contest"));
	}
}
