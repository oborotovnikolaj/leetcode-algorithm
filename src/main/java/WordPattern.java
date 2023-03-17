/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        char[] patternArr = pattern.toCharArray();
        Map<String, Character> wordToChar = new HashMap();
        Map<Character, String> charToWord = new HashMap();
        String[] words = s.split(" ");

        if (words.length != patternArr.length) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            Character c = wordToChar.get(words[i]);
            String word = charToWord.get(patternArr[i]);
            if (c == null && word == null) {
                wordToChar.put(words[i], patternArr[i]);
                charToWord.put(patternArr[i], words[i]);
            } else {
                if (c != null && word != null) {
                    if (c != patternArr[i] || !words[i].equals(word)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
