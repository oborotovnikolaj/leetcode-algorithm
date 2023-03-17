/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        boolean isIncrease = true;
        int prev = -1;

        for(int i : arr) {

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
            } else {
                if (prev < i) {
                    return false;
                }
            }

            prev = i;
        }
        return !isIncrease;
    }
}
