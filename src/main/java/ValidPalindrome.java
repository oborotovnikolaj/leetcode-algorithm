/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        List<Character> chars = getListOfChars(s);
        return isPalindrome(chars);
    }

    private List<Character> getListOfChars(String s) {
        List<Character> chars = new ArrayList();
        for(char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                chars.add(c);
            }
        }
        return chars;
    }

    private boolean isPalindrome(List<Character> chars) {
        int middle = chars.size() / 2;
        for(int i = 0; i < middle; i++) {
            if (chars.get(i) != chars.get(chars.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
