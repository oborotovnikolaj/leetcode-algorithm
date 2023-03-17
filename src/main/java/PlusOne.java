/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

public class PlusOne {

        public int[] plusOne(int[] digits) {
            for (int i = 0; i < digits.length; i++) {
                if (digits[digits.length - 1 - i] == 9) {
                    digits[digits.length - 1 - i] = 0;
                } else {
                    digits[digits.length - 1 - i] = digits[digits.length - 1 - i] + 1;
                    break;
                }
            }
            if (digits[0] == 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
            return digits;
        }

}
