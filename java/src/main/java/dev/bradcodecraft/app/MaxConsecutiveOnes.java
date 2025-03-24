package dev.bradcodecraft.app;

/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    if (nums.length == 0 || nums.equals(new int[] { 0 })) {
      return 0;
    } else if (nums.equals(new int[] { 1 })) {
      return 1;
    } else {
      int currentTotal = 0;
      int currentMax = 0;

      for (int number : nums) {
        if (number == 0) {
          currentTotal = Math.max(currentMax, currentTotal);
          currentMax = 0;
        } else {
          currentMax++;
        }
      }

      return Math.max(currentMax, currentTotal);
    }
  }
}
