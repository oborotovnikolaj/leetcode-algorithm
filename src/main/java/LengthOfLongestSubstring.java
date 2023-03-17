import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstringBrute(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++) {
            HashSet<Character> substring = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (!substring.contains(chars[j])) {
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

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.remove(objects.size() - 1);
        System.out.println("sdf");
    }

    public int lengthOfLongestSubstring2(String s) {

        List<Character> longest = new ArrayList();
        int maxSize = 0;
        for (char c : s.toCharArray()) {
            if (!longest.contains(c)) {
                longest.add(c);
                if (maxSize < longest.size()) {
                    maxSize = longest.size();
                }
            } else {
                int i = longest.indexOf(c);
                for (int j = 0; j <= i; j++) {
                    System.out.println(longest.remove(0));
                }
                longest.add(c);
            }
        }
        return maxSize;
    }

    public boolean validMountainArray(int[] arr) {

        boolean isIncrease = true;
        int prev = -1;
        for (int i : arr) {

            if (prev == i) {
                return false;
            }

            if (isIncrease) {
                if (prev > i) {
                    if (prev == arr[0]) {
                        return false;
                    }
                    isIncrease = false;
                }
                prev = i;
            } else {
                if (prev < i) {
                    return false;
                }
                prev = i;
            }
        }
        return !isIncrease;

    }

}
