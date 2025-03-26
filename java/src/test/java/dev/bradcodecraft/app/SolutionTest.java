package dev.bradcodecraft.app;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

  @Test
  void testMergeSortedArray() {
    int[] arrayOne = new int[] { 1, 2, 3, 0, 0, 0 };
    new Solution().merge(arrayOne, 3, new int[] { 2, 5, 6 }, 3);
    assertArrayEquals(
        new int[] { 1, 2, 2, 3, 5, 6 },
        arrayOne);

    int[] arrayTwo = new int[] { 1 };
    new Solution().merge(arrayTwo, 1, new int[] {}, 0);
    assertArrayEquals(
        new int[] { 1 },
        arrayTwo);

    int[] arrayThree = new int[] { 0 };
    new Solution().merge(arrayThree, 0, new int[] { 1 }, 1);
    assertArrayEquals(
        new int[] { 1 },
        arrayThree);

    int[] arrayFour = new int[] { 2, 0 };
    new Solution().merge(arrayFour, 1, new int[] { 1 }, 1);
    assertArrayEquals(
        new int[] { 1, 2 },
        arrayFour);
  }

  @Test
  void testRemoveElement() {
    assertEquals(2, new Solution().removeElement(new int[] { 3, 2, 2, 3 }, 3));
    assertEquals(5, new Solution().removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
  }

  @Test
  void testRemoveDuplicates() {
    assertEquals(2, new Solution().removeDuplicates(new int[] { 1, 1, 2 }));
    assertEquals(5, new Solution().removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
  }

  @Test
  void testCheckIfExist() {
    assertTrue(new Solution().checkIfExist(new int[] { 10, 2, 5, 3 }));
    assertFalse(new Solution().checkIfExist(new int[] { 3, 1, 7, 11 }));
  }
}
