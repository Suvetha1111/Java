/*
The highest number which divides 20 and 30 is 10. So the GCD of 20, 30 is 10.
The lowest number that can be divided by 20 and 30, leaving remainder 0 is 60.
So the LCM of 20 and 30 is 60.
*/public class GCD_LCM {
    public static void main(String[] args) {
//        System.out.println(gcd(4, 9));
        System.out.println(lcm(2, 7));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
