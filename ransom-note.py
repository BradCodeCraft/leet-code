from typing import Dict


def canConstruct(ransomNote: str, magazine: str) -> bool:
    for letter in ransomNote:
        if letter not in magazine:
            return False
        else:
            magazine = magazine.replace(letter, "", 1)

    return True
