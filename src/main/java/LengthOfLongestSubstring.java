import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstringBrute(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            HashSet<Character> substring = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if(!substring.contains(chars[j])) {
                    substring.add(chars[j]);
                    substring.add(chars[j]);
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, substring.size());
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> substring = new HashSet<>();
        int maxLength = 0;
        int head = 0;
        for (int i = 0; i < chars.length; i++) {
            if (substring.contains(chars[i])) {
                maxLength = Math.max(substring.size(), maxLength);
                for (int j = head; j < i; j++) {
                    if (chars[j] == chars[i]) {
                        head = j + 1;
                        break;
                    } else {
                        substring.remove(chars[j]);
                    }
                }
            } else {
                substring.add(chars[i]);
            }
        }

        return Math.max(substring.size(), maxLength);
    }

}
