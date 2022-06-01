import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zerosSize = 0;
        int notZerosSize = 0;
        int head = -1;

        if (nums[0] == 0) {
            zerosSize = 1;
        } else {
            notZerosSize = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (nums[i - 1] == 0) {
                    zerosSize += 1;
                } else {
                    System.arraycopy(nums, head + 1 + zerosSize, nums, head + 1, notZerosSize);
                    head = head + notZerosSize;
                    notZerosSize = 0;
                    zerosSize++;
                }
            } else {
                notZerosSize += 1;
            }
        }
        System.arraycopy(nums, head + 1 + zerosSize, nums, head + 1, notZerosSize);
        Arrays.fill(nums, head + 1 + notZerosSize, head + 1 + notZerosSize + zerosSize, 0);
    }

    public void moveZeroesEasy(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        if (j != nums.length) {
            Arrays.fill(nums, j, nums.length, 0);
        }
    }

}
