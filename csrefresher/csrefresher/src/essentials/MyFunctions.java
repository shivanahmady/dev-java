package essentials;

public class MyFunctions {
    public int GCD_BruteForce(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public int GCD_EA(int x, int y) {
        if (y == 0)
            return x;
        return GCD_EA(y, x % y);
    }
}
