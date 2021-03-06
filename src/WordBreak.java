import java.util.Arrays;
import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		// write your code here
		boolean[] t = new boolean[s.length() + 1];
		t[0] = true;
		for (int i = 0; i < s.length(); i++) {
			if (!t[i])
				continue;
			for (String sub : dict) {
				int len = sub.length();
				int end = i + len;
				if (end > s.length())
					continue;
				if (t[end])
					continue;
				if (s.substring(i, end).equals(sub)) {
					t[end] = true;
				}
			}
		}
		return t[s.length()];
	}

	public boolean wordBreak2(String s, Set<String> dict) {
		int[] pos = new int[s.length() + 1];
		Arrays.fill(pos, -1);
		pos[0] = 0;
		for (int i = 0; i < s.length(); i++) {
			if (pos[i] != -1) {
				for (int j = i + 1; j <= s.length(); j++) {
					String sub = s.substring(i, j);
					if (dict.contains(sub)) {
						pos[j] = i;
					}
				}
			}
		}
		return pos[s.length()] != -1;
	}
}
