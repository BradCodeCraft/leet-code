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

  /*
   * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
   * order, and two integers m and n, representing the number of elements in nums1
   * and nums2 respectively.
   * 
   * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
   * 
   * The final sorted array should not be returned by the function, but instead be
   * stored inside the array nums1. To accommodate this, nums1 has a length of m +
   * n, where the first m elements denote the elements that should be merged, and
   * the last n elements are set to 0 and should be ignored. nums2 has a length of
   * n.
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int nums1Pointer = m - 1, nums2Pointer = n - 1;
    int insertPointer = m + n - 1;

    while (nums2Pointer >= 0) {
      if (nums1Pointer >= 0 && nums1[nums1Pointer] > nums2[nums2Pointer]) {
        nums1[insertPointer--] = nums1[nums1Pointer--];
      } else {
        nums1[insertPointer--] = nums2[nums2Pointer--];
      }
    }
  }

  /*
   * Given an integer array nums and an integer val, remove all occurrences of val
   * in nums in-place. The order of the elements may be changed. Then return the
   * number of elements in nums which are not equal to val.
   * 
   * Consider the number of elements in nums which are not equal to val be k, to
   * get accepted, you need to do the following things:
   * 
   * - Change the array nums such that the first k elements of nums contain the
   * elements which are not equal to val. The remaining elements of nums are not
   * important as well as the size of nums.
   * - Return k.
   * 
   */
  public int removeElement(int[] nums, int val) {
    int pointer = 0;

    for (int number : nums) {
      if (number != val) {
        nums[pointer] = number;
        pointer++;
      }
    }

    return pointer;
  }

  /*
   * Given an integer array nums sorted in non-decreasing order, remove the
   * duplicates in-place such that each unique element appears only once. The
   * relative order of the elements should be kept the same. Then return the
   * number of unique elements in nums.
   * 
   * Consider the number of unique elements of nums to be k, to get accepted, you
   * need to do the following things:
   * 
   * - Change the array nums such that the first k elements of nums contain the
   * unique elements in the order they were present in nums initially. The
   * remaining elements of nums are not important as well as the size of nums.
   * - Return k.
   * 
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int insertIndex = 1;

    for (int readIndex = 1; readIndex < nums.length; readIndex++) {
      if (nums[readIndex] != nums[readIndex - 1]) {
        nums[insertIndex++] = nums[readIndex];
      }
    }

    return insertIndex;
  }
}
