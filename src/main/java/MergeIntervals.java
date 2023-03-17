import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */
//https://leetcode.com/problems/merge-intervals/
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList();

        intervals = sort(intervals);

        result.add(intervals[0]);
        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++ ) {
            boolean overlap = false;
            if (intervals[i][0] <= right && intervals[i][0] >= left) {
                overlap = true;
                right = Math.max(intervals[i][1], right);
            }
            if (intervals[i][1] >= left && intervals[i][1] <= right) {
                overlap = true;
                left = Math.min(intervals[i][0], left);
            }
            if (intervals[i][1] > right && intervals[i][0] < left) {
                overlap = true;
                right = intervals[i][1];
                left = intervals[i][0];
            }
            if (overlap) {
                result.get(result.size() - 1)[0] = left;
                result.get(result.size() - 1)[1] = right;
            } else {
                result.add(intervals[i]);
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        return result.toArray(v -> new int[v][]);
    }

    private int[][] sort2(int[][] i) {
        Arrays.sort(i, (i1, i2) -> i1[0] > i2[0] ? 1 : -1);
        return i;
    }

    private int[][] sort(int[][] i) {
        Arrays.sort(i, Comparator.comparingInt(i2 -> i2[0]));
        return i;
    }

    public static void main(String[] args) {
        ArrayList<int[]> objects = new ArrayList<>();
        objects.add(new int[] {1, 2});
        objects.add(new int[] {2, 3});
        objects.add(new int[] {12, 16});
        objects.add(new int[] {10, 15});
        int[] ints = {2, 3};
        int[][] a = new int[][]{ints};
        int[][] ints1 = objects.toArray(v -> new int[v][]);
        System.out.println(objects);

        Arrays.asList(ints1);

        Arrays.sort(ints1, (i1, i2) -> i1[0] > i2[0] ? 1 : -1);

        System.out.println("sdf");
    }


//    class Solution {
//
//        public int[][] merge(int[][] intervals) {
//
//            List<int[]> result = new ArrayList();
//            result.add(intervals[0]);
//            int left = intervals[0][0];
//            int right = intervals[0][1];
//
//            for (int i = 1; i < intervals.length; i++ ) {
//                boolean overlap = false;
//                if (intervals[i][0] <= right && intervals[i][0] >= left) {
//                    overlap = true;
//                    right = Math.max(intervals[i][1], right);
//                }
//                if (intervals[i][1] >= left && intervals[i][1] <= right) {
//                    overlap = true;
//                    left = Math.min(intervals[i][0], left);
//                }
//                if (intervals[i][1] > right && intervals[i][0] < left) {
//                    overlap = true;
//                    right = intervals[i][1];
//                    left = intervals[i][0];
//                }
//                if (overlap) {
//                    result.get(result.size() - 1)[0] = left;
//                    result.get(result.size() - 1)[1] = right;
//                } else {
//                    Iterator iter = result.iterator();
//                    while(iter.hasNext()) {
//                        int[] inter = iter.next()
//
//                    }
//                    result.add(intervals[i]);
//                }
//            }
//
//            return result.toArray(v -> new int[v][]);
//        }
//
//    }


}



