package com.ye.structure.stack.array;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Test Seq 12345";	// 테스트 입력 문자열
		String t = reverse(input);
		System.out.println("Input string: " + input);
		/* Input string: Test Seq 12345 */
		System.out.println("Reverse string: " + t);
		/* Reverse string: 54321 qeS tseT */
	}

	private static String reverse(String s) {
		ArrayStack<Character> st = new ArrayStack<>(s.length());
		for (int i = 0; i < s.length(); i++) { 
			st.push(s.charAt(i));	// s의 i번 문자. 번호는 0번부터 시작
		}
		String output = "";
		while (!st.isEmpty()) { output += st.pop(); }
		return output;
	}
}
