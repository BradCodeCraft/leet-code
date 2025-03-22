from typing import List


def merge(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    left: int = m

    for right in range(n):
        nums1[left] = nums2[right]
        left +=1

    nums1.sort()
