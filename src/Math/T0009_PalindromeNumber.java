package Math;

public class T0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int num = 0;

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }

        return x == num || x == num / 10;
    }
}
