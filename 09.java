/*
 * Input: S = "ab#c", T = "ad#c" Output: true Explanation: Both S and T become
 * "ac".
 */

class Solution {
	public boolean backspaceCompare(String S, String T) {

		Stack<Character> schar = new Stack<Character>();
		Stack<Character> tchar = new Stack<Character>();

		for (char c : S.toCharArray()) {
			if (c == '#') {
				if (!schar.isEmpty()) {
					schar.pop();
				}
			} else {
				schar.push(c);
			}
		}

		for (char c : T.toCharArray()) {
			if (c == '#') {
				if (!tchar.isEmpty()) {
					tchar.pop();
				}
			} else {
				tchar.push(c);
			}
		}

		if (schar.size() != tchar.size()) {
			System.out.println("here");
			return false;
		} else {
			while (!schar.isEmpty()) {
				if (schar.pop() != tchar.pop()) {
					return false;
				}
			}
		}
		return true;
	}
}
