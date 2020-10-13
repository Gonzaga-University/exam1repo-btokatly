#!/usr/bin/env python3

import sys
import java.util.Scanner;

class Adder():
    def __init__(self, val1, val2, val3):
        self.val1 = val1
        self.val2 = val2
        self.val3 = val3

    def getSum(self):
        return self.val1 + self.val2 + self.val3


if __name__ == "__main__":
    print("Starting program")

    adder = Adder(10, 20, 30)
    print(adder.getSum())

    print("Done with program")