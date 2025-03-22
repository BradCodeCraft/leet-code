def numberOfSteps(num: int) -> int:
    number_of_steps: int = 0

    while num > 0:
        if num % 2 == 0:
            num /= 2
        else:
            num -= 1

        number_of_steps += 1

    return number_of_steps


numberOfSteps(14)
