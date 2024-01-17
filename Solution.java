import java.util.Arrays;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] numsClone = nums.clone();
        int[] max = new int[k];
        Arrays.sort(numsClone);

        for (int i = 0, j = numsClone.length - 1; i < k && i < numsClone.length; i++, j--) {
            max[i] = numsClone[j];
        }

        return max;
    }
}

