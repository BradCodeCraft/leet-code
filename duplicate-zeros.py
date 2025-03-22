from typing import List


def duplicateZeros(arr: List[int]) -> None:
    index: int = 0
    size: int = len(arr)

    while index < size:
        if arr[index] == 0:
            arr.insert(index, 0)
            index += 1

        index += 1

    while len(arr) > size:
        arr.pop()
