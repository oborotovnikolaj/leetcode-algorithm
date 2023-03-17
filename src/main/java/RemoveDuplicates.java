/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

//https://leetcode.com/problems/remove-duplicates-from-sorted-array
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int tail = 0;
        int current = -101;
        for (int i = 0; i < nums.length; i++) {
            if (current < nums[i]) {
                nums[tail] = nums[i];
                current = nums[i];
                tail++;
            }
        }
        return tail;
    }
}
