/*
Given an integer n, return an array ans whose length is n+1 such that for each i (0 <= i <= n) ans[i] is the number of 1’s in binary representation of i. 
Example:
Input:  n = 5
Output: [0, 1, 1, 2, 1, 2 ]
The condition (i & 1) == 1 in your code is used to check if the integer i is odd. Here's a detailed explanation of the logic behind this condition:

Bitwise AND Operator &:

The bitwise AND operator & takes two numbers and performs a logical AND operation on each pair of corresponding bits. The result is a new number where each bit is 1 if both corresponding bits of the operands are 1, and 0 otherwise.
Binary Representation of Numbers:

In binary representation, even numbers always end with a 0, and odd numbers always end with a 1. For example:
4 in binary: 100
5 in binary: 101
Checking the Least Significant Bit (LSB):

The expression i & 1 isolates the least significant bit (LSB) of the number i. The LSB is the rightmost bit in the binary representation.
If the LSB is 1 (i & 1 == 1), the number is odd.
If the LSB is 0 (i & 1 == 0), the number is even.
Ternary Operator ? ::

The ternary operator is a shorthand for an if-else statement. The expression (i & 1) == 1 ? ans[i / 2] + 1 : ans[i / 2] can be read as:
If i is odd ((i & 1) == 1), then ans[i] = ans[i / 2] + 1.
If i is even ((i & 1) == 0), then ans[i] = ans[i / 2].
Explanation of the Code Logic:
The countingSetBits function calculates the number of set bits (1s) in the binary representation of each number from 0 to n.
The number of set bits in an odd number i is one more than the number of set bits in i / 2 (since dividing by 2 shifts all bits right, removing the LSB, and we know the LSB of i was 1).
The number of set bits in an even number i is the same as the number of set bits in i / 2 (since dividing by 2 shifts all bits right, removing the LSB, and we know the LSB of i was 0).


Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.*;

class TUF{
static int[] countingSetBits(int n)
{
    int ans[]=new int[n + 1];
    if (n == 0)
        return new int[]{0};
    if (n == 1)
        return new int[]{0,1};
    ans[0] = 0;
    ans[1] = 1;
    for (int i = 2; i <= n; i++)
        ans[i] = (i & 1)==1 ? ans[i / 2] + 1 : ans[i / 2];
    return ans;
}
public static void main(String args[])
{
    int n=5;
    int ans[] = countingSetBits(n);
    for (int val : ans)
    System.out.print(val+" ");
}
} 
