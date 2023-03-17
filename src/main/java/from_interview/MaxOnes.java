/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

// Дан непустой массив из нулей и единиц.
// Нужно определить, какой максимальный по длине подынтервал единиц можно получить, удалив ровно один элемент массива.

// [1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1] -> 5
// [1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1] -> 6
// [1, 1, 0] -> 2
// [1, 1, 1] -> 2

//init           1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1
//before =       0  0  0  0  3  3  3  2  2  2  2  2
//after =        0  1  2  3  0  1  2  0  1  2  3  4
//bestResult =   0  1  2  3  3  4  5  5  5  5  5  6

package from_interview;

public class MaxOnes {

    public int count(int[] arr) {

        int before = 0;
        int after = 0;
        int bestResult = 0;

        for (int j : arr) {

            if (j == 1) {
                after++;
            } else {
                before = after;
                after = 0;
            }

            if (before + after > bestResult) {
                bestResult = before + after;
            }

        }

        return bestResult == arr.length ? bestResult - 1 : bestResult;
    }
}
