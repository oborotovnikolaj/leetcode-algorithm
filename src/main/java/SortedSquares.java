import java.util.PriorityQueue;

public class SortedSquares {

    public int[] sortedSquaresPriorityQueue(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(nums.length);
        for (int i : nums) {
            heap.add(i * i);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = heap.poll();
        }

        return nums;
    }

    public int[] sortedSquares(int[] nums) {
        int tail = nums.length - 1;
        int head = 0;
        int[] result = new int[nums.length];
        int tailValue = nums[tail] * nums[tail];
        int headValue = nums[head] * nums[head];
        for (int i = 0; i < nums.length; i++) {
            tailValue = nums[tail] * nums[tail];
            headValue = nums[head] * nums[head];
            if (tailValue >= headValue) {
                result[nums.length - 1 - i] = tailValue;
                tail -= 1;
            } else {
                result[nums.length - 1 - i] = headValue;
                head += 1;
            }

        }
        return result;
    }
}
