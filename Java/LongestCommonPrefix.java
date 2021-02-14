package Java;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < result.length(); j++) {
                if (j >= s.length() || result.charAt(j) != s.charAt(j)) {
                    result = result.substring(0, j);
                    break;
                }
            }
        }
        return result;
    }
}
