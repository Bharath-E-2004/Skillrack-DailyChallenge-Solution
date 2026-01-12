#include <stdio.h>
#include <math.h>

int insertBits(int x, int y)
{
    // Step 1: find position of last set bit in x
    int lastSetBit = x & (-x);
    int pos = log2(lastSetBit);

    // Step 2: count number of bits in y
    int bitsY = 0;
    int temp = y;
    while (temp > 0) {
        bitsY++;
        temp >>= 1;
    }

    // Step 3: split x
    int lowerMask = (1 << (pos + 1)) - 1;
    int lowerPart = x & lowerMask;
    int upperPart = x >> (pos + 1);

    // Step 4: construct new number
    int result = lowerPart |
                 (y << (pos + 1)) |
                 (upperPart << (pos + 1 + bitsY));

    return result;
}
