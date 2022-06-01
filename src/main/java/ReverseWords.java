public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            sb.append(reverseString(strings[i].toCharArray()));
            if (i != strings.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
        return s;
    }

}
