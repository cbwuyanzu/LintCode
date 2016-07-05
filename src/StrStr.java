class strStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
	public int strStr(String source, String target) {
		// write your code here
		if (source == null || target == null) {
			return -1;
		}
		if (source.indexOf(target) >= 0) {
			return source.indexOf(target);
		}
		return -1;
	}
}