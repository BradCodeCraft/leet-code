from typing import List


def fizzBuzz(self, n: int) -> List[str]:
    result_array: List[str] = []

    for i in range(1, n + 1):
        if i % 3 == 0 and i % 5 == 0:
            result_array.append("FizzBuzz")
        elif i % 3 == 0 and i % 5 != 0:
            result_array.append("Fizz")
        elif i % 5 == 0 and i % 3 != 0:
            result_array.append("Buzz")
        else:
            result_array.append(str(i))

    return result_array
