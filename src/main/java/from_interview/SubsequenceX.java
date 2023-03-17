package from_interview;/*
 * Copyright 2022 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */

// Дан непустой массив целых чисел, нужно найти непустой подотрезок (непрерывную подпоследовательность) с заданной суммой X,
// либо сказать, что это невозможно.
// Для найденного отрезка (если он существует) следует выдать на выход индексы его концов.

import java.util.HashMap;
import java.util.Map;

// Дан непустой массив целых чисел, нужно найти непустой подотрезок (непрерывную подпоследовательность) с заданной суммой X,
// либо сказать, что это невозможно.
// Для найденного отрезка (если он существует) следует выдать на выход индексы его концов.

// [1, 2, -3, 4, 5]
// X = 6 -> (2, 4)
// X = 1 -> (0, 0) or (2, 3)
// X = 100 -> (-1, -1)
//


public class SubsequenceX {

    public int[] getSubsequence(int[] arr, int x) {
        int[] diff = new int[arr.length];
        diff[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            diff[i] = diff[i - 1] + arr[i];
        }

        Map<Integer, Integer> valueToPosition = new HashMap<>();
        for (int i = 0; i < diff.length; i++) {
            valueToPosition.putIfAbsent(diff[i], i);
        }

        //у нулевого элемента не подсчитаешь l - 1 поэтому воть так
        if (diff[0] - x == 0) {
            return new int[] {0, 0};
        }

        for (int i = 0; i < arr.length; i++) {
            if (valueToPosition.containsKey(diff[i] - x) && valueToPosition.get(diff[i] - x) < i)
                return new int[]{valueToPosition.get(diff[i] - x) + 1, i};
        }
        return new int[]{-1, -1};
    }

}
