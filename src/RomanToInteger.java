public class RomanToInteger {
    /**
     * @param s Roman representation
     * @return an integer
     */
    public int romanToInt(String s) {
		if (s.length() < 1)
			return 0;
		int result = 0;
		int sub = getRomanValue(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			int sub2 = getRomanValue(s.charAt(i));
			if (sub < sub2) {
				result -= sub;
			} else {
				result += sub;
			}
			sub = sub2;
		}
		result += sub;
		return result;
	}

	public int getRomanValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}