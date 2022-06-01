public class Rotate {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, nums.length - k);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }

}
