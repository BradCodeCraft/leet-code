package dev.bradcodecraft.app;

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
}
