from typing import List, Set

"""
Given an array arr of integers, check if there exist two indices i and j such that :
    i != j
    0 <= i, j < arr.length
    arr[i] == 2 * arr[j]

"""


def checkIfExist(arr: List[int]) -> bool:
    temporary_set: Set[int] = set()

    for num in arr:
        if num / 2 in temporary_set or num * 2 in temporary_set:
            return True

        temporary_set.add(num)

    return False
