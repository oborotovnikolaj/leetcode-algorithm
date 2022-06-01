public class BinarySearch {

    public int search(int[] nums, int target) {
        int tail = nums.length - 1;
        int head = 0;
        while (tail - head > 1) {
            if (nums[head] == target) {
                return head;
            }
            if (nums[head] < target) {
                head = (head + tail) / 2;
            } else {
                int oldTail = tail;
                tail = head;
                head = (3 * head - oldTail) / 2;
                head = head < 0 ? 0 : head;
            }
        }
        return nums[tail] == target ? tail : nums[head] == target ? head : -1;
    }
}
