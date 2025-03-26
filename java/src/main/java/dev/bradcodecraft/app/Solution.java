package dev.bradcodecraft.app;

import java.util.Arrays;

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

  /*
   * Given an integer array nums sorted in non-decreasing order, return an array
   * of the squares of each number sorted in non-decreasing order.
   */
  public int[] sortedSquares(int[] nums) {
    int length = nums.length;
    int left = 0;
    int right = length - 1;
    int[] result = new int[length];

    for (int i = right; i >= 0; i--) {
      if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        result[i] = nums[left] * nums[left];
        left++;
      } else {
        result[i] = nums[right] * nums[right];
        right--;
      }
    }

    return result;
  }

  /*
   * Given a fixed-length integer array arr, duplicate each occurrence of zero,
   * shifting the remaining elements to the right.
   * 
   * NOTE: that elements beyond the length of the original array are not written.
   * Do the above modifications to the input array in place and do not return
   * anything.
   */
  public void duplicateZeros(int[] arr) {
    int length = arr.length;
    int[] temporaryArray = Arrays.copyOf(arr, length);
    int temporaryArrayPointer = 0, arrayPointer = 0;

    while (arrayPointer < length) {
      arr[arrayPointer] = temporaryArray[temporaryArrayPointer];

      if (temporaryArray[temporaryArrayPointer] == 0 && arrayPointer < length - 1) {
        arr[++arrayPointer] = 0;
      }

      temporaryArrayPointer++;
      arrayPointer++;
    }
  }
}
