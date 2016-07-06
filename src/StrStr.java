class StrStr {
	/**
	 * Returns a index to the first occurrence of target in source, or -1 if
	 * target is not part of source.
	 * 
	 * @param source
	 *            string to be scanned.
	 * @param target
	 *            string containing the sequence of characters to match.
	 */
	public int strStr(String source, String target) {
		// write your code here
		if (source == null || target == null) {
			return -1;
		}
		if (target.length() == 0) {
			return 0;
		}
		if (target.length() > source.length()) {
			return -1;
		}
		for (int i = 0; i < source.length() - target.length() + 1; i++) {
			boolean flag = true;
			for (int j = 0; j < target.length(); j++) {
				if (target.charAt(j) - source.charAt(j + i) != 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return i;
			}
		}
		return -1;
	}
}