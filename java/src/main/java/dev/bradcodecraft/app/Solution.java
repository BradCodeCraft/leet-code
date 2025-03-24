package dev.bradcodecraft.app;

public class Solution {
  /*
   * Given a binary array nums, return the maximum number of consecutive 1's in
   * the array.
   */
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

  /*
   * Given an array nums of integers, return how many of them contain an even
   * number of digits.
   */
  public int findNumbers(int[] nums) {
    int total = 0;

    for (int number : nums) {
      int numberOfDigits = (int) Math.log10(number) + 1;

      if (numberOfDigits % 2 == 0) {
        total++;
      }
    }

    return total;
  }
}
