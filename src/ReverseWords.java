import java.util.Stack;

public class ReverseWords {
	public String reverseWords(String s) {
		// write your code
		if (s == null) {
			return s;
		}
		if (s.indexOf(" ") < 0) {
			return s;
		}
		Stack<String> stack = new Stack<String>();
		int slow = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1 || Character.isWhitespace(s.charAt(i))) {
				if (i == slow) {
					slow++;
				} else {
					if (i != s.length() - 1) {
						stack.push(s.substring(slow, i));
						slow = i + 1;
					} else {
						stack.push(s.substring(slow));
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		if (!stack.isEmpty()){
		    sb.append(stack.pop());
		}
		while (!stack.isEmpty()) {
			sb.append(" ");
			sb.append(stack.pop());
		}
		return sb.toString();
	}
}
