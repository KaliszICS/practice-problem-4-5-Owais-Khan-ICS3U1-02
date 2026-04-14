/**
	* File: Lesson 4.5 - Nested Loops
	* Author: Owais Ali Khan
	* Date Created: April 14, 2026
	* Date Last Modified: April 14, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static String triangle(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			String current = "";
			for (int j = 0; j < i; j++) {
				current += "*";
			}
			result += current + "\n";
		}
		return result;
	}

	public static String pyramid(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			String current = "";
			for (int j = n-i; j > 0; j--) {
				current += " ";
			}
			current += "*";
			for (int k = 1; k < i; k++) {
				current += " *";
			}
			result += current + "\n";
		}
		return result;
	}

	public static String multiplicationTable(int num) {
		String result = "";
		for (int i = 1; i <= num; i++) {
			String current = i+"";
			for (int j = 2; j <= num; j ++) {
				current += " " + i*j;
			}
			result += current + "\n";
		}
		return result;
	}
	

}
