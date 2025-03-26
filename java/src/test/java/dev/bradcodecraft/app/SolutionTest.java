package dev.bradcodecraft.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  void testFindMaxConsecutiveOnes() {
    assertEquals(3, new Solution().findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    assertEquals(2, new Solution().findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
  }

  @Test
  void testFindNumbers() {
    assertEquals(2, new Solution().findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
    assertEquals(1, new Solution().findNumbers(new int[] { 555, 901, 482, 1771 }));
  }

  @Test
  void testSortedSquares() {
    assertArrayEquals(
        new int[] { 0, 1, 9, 16, 100 },
        new Solution().sortedSquares(new int[] { -4, -1, 0, 3, 10 }));

    assertArrayEquals(
        new int[] { 4, 9, 9, 49, 121 },
        new Solution().sortedSquares(new int[] { -7, -3, 2, 3, 11 }));
  }

  @Test
  void testDuplicateZeros() {
    int[] arrayOne = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
    new Solution().duplicateZeros(arrayOne);
    assertArrayEquals(
        new int[] { 1, 0, 0, 2, 3, 0, 0, 4 },
        arrayOne);

    int[] arrayTwo = new int[] { 0, 0, 0, 0, 0, 0, 0 };
    new Solution().duplicateZeros(arrayTwo);
    assertArrayEquals(
        new int[] { 0, 0, 0, 0, 0, 0, 0 },
        arrayTwo);
  }
}
