class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
        // Your code here
        while(n!=1&&n%2==0)
        n/=2;
        if(n==1)
         return true;
        return false;
    }
}
/*
Bitwise AND Trick:
Consider a number n that is a power of two. Its binary representation has a single 1 followed by zeros.
If you subtract 1 from n, the binary representation of n-1 will have all the bits flipped after the position of the single set bit. For example:
If n = 8 (binary 1000), then n-1 = 7 (binary 0111).
When you perform a bitwise AND (&) between n and n-1, the result will be 0 if n is a power of two because the single set bit in n and the corresponding bit in n-1 will differ, resulting in 0.
The Complete Function:
java
Copy code
boolean isPowerOfTwoUsingBitwiseOperation(int n) {
    return (n != 0) && ((n & (n - 1)) == 0);
}
n != 0: This check ensures that n is not zero because zero is not a power of two.
(n & (n - 1)) == 0: This checks if n has exactly one set bit. If n is a power of two, this expression will be true; otherwise, it will be false.
*/
class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n) {
        // Your code here
       return (n!=0)&&((n&(n-1))==0);
    }
}
