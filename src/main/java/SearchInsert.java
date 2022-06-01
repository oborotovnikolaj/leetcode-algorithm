public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int tail = nums.length - 1;
        int pivot = tail / 2;
        int head = 0;
        while (tail - head > 1) {
            if (nums[pivot] > target) {
                tail = pivot;
            } else {
                head = pivot;
            }
            pivot = head + (tail - head) / 2;

        }
        if (nums[tail] < target) {
            return tail + 1;
        }
        if (nums[tail] >= target && target > nums[head]) {
            return tail;
        }
        return head;
    }

}
