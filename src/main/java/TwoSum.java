public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int j = i + 1;
            while (j < numbers.length) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
                if (numbers[i] + numbers[j] > target) {
                    break;
                }
                j++;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumReverse(int[] numbers, int target) {

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = i - 1;
            while (j >= 0) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{j + 1, i + 1};
                }
                if (numbers[i] + numbers[j] < target) {
                    break;
                }
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumReverseReverse(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int j = numbers.length - 1;
            while (j >= 0) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{Math.min(i, j) + 1, Math.max(i, j) + 1};
                }
                if (numbers[i] + numbers[j] < target) {
                    break;
                }
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumGoodSolution(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target)
                return new int[]{l + 1, r + 1};
            else if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;
        }
        return new int[]{-1, -1};
    }
}
