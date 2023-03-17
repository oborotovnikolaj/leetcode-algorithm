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

public class RestoreIpAddress {

    private static final char DOT = '.';
    private String initialString;
    private List<Character> chars = new ArrayList();
    private List<int[]> indexesOfDots = new ArrayList();

    public List<String> restoreIpAddresses(String s) {
        this.initialString = s;
        for (Character c : s.toCharArray()) {
            this.chars.add(c);
        }

        for (int i = 0; i <= 2; i++) {
            if (validate(0, i)) {
                for (int j = 1; j <= 3; j++) {
                    if (validate(i + 1, i + j)) {
                        for (int k = 1; k <= 3; k++) {
                            if (validate(i + j + 1, i + j + k) && validate(i + j + k + 1, chars.size() - 1)) {
                                this.indexesOfDots.add(new int[]{i + 1, i + j + 1, i + j + k + 1});
                            }
                        }
                    }
                }
            }
        }
        return convertToStrings(indexesOfDots);
    }

    private boolean validate(int startIndex, int endIndex) {
        if (startIndex > this.chars.size() - 1 || endIndex > this.chars.size() - 1) {
//            System.out.println("incorrect index start: " + startIndex + " end: " + endIndex);
            return false;
        }
        if ('0' == this.chars.get(startIndex) && endIndex - startIndex > 0) {
//            System.out.println("null first start: " + startIndex + " word: " + initialString.substring(startIndex, endIndex));
            return false;
        }
        if (endIndex - startIndex > 2) {
//            System.out.println("too long: " + startIndex + " word: " + initialString.substring(startIndex, endIndex));
            return false;
        }
        if (endIndex - startIndex > 1) {
            return Integer.parseInt(initialString.substring(startIndex, endIndex + 1)) <= 255;
        }
        return true;
    }

    private List<String> convertToStrings(List<int[]> indexesOfDots) {
        List<String> result = new ArrayList();
        for (int[] indexes : indexesOfDots) {
            String ip = this.initialString.substring(0, indexes[0])
                    + DOT
                    + this.initialString.substring(indexes[0], indexes[1])
                    + DOT
                    + this.initialString.substring(indexes[1], indexes[2])
                    + DOT
                    + this.initialString.substring(indexes[2]);
            result.add(ip);
        }
        return result;
    }
}