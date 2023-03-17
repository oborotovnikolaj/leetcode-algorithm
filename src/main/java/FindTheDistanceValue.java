/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/submissions/916327868/
public class FindTheDistanceValue {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    count++;
                    break;
                }
            }
        }
        return arr1.length - count;
    }

    public int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    count++;
                    break;
                }
            }
        }
        return arr1.length - count;
    }
}
