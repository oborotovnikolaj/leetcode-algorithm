/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

import java.util.Arrays;

//https://leetcode.com/problems/string-compression/
public class StringCompression {

    public int compress(char[] chars) {
        char prev = chars[0];
        int count = 1;
        int tail = 0;
        for (int i = 1; i < chars.length; i++) {
            if (prev == chars[i]) {
                count++;
            } else {
                chars[tail] = prev;
                tail++;
                if (count > 1) {
                    String digits = String.valueOf(count);
                    for (int j = 0; j < digits.length(); j++) {
                        chars[tail] = digits.charAt(j);
                        tail++;
                    }
                }
                prev = chars[i];
                count = 1;
            }
        }
        chars[tail] = prev;
        tail++;
        if (count > 1) {
            String digits = String.valueOf(count);
            for (int j = 0; j < digits.length(); j++) {
                chars[tail] = digits.charAt(j);
                tail++;
            }
        }
        chars = Arrays.copyOfRange(chars, 0, tail);
        return tail;
    }
}
