package dev.bradcodecraft.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {
  @Test
  void test() {
    assertEquals(3, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
    assertEquals(2, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] { 1, 0, 1, 1, 0, 1 }));
  }
}
