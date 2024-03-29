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

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            Map<Character, Integer> sCharacter = new HashMap();
            for(char c : s.toCharArray()) {
                sCharacter.merge(c, 1, (old, cur) -> {return old + cur;});
            }
            Map<Character, Integer> tCharacter = new HashMap();
            for(char c : t.toCharArray()) {
                tCharacter.merge(c, 1, (old, cur) -> old + cur);
            }
            return tCharacter.equals(sCharacter);
        } else {
            return false;
        }
    }

}
