package org.sapient;

public class MyNumberImpl implements MyNumber {
    @Override
    public int checkPrime(int x) {
        if (x == 1)
            return 0;
        else if (x == 2)
            return 1;
        // will return 1 if prime else 0
        for (int i = 2; i < Math.sqrt(x) + 1; i++) {
            if (x % i == 0)
                return 0;
        }
        return 1;
    }

    @Override
    public boolean checkArmstrong(int x) {
        int sum = x;
        int digits = String.valueOf(x).length();
        while (x != 0) {
            int temp = x % 10;
            sum -= Math.pow(temp, digits);
            x /= 10;
        }
        return sum == 0;
    }

    @Override
    public boolean checkPalindrome(int x) {
        String numStr = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(numStr);
        String revStr = stringBuilder.reverse().toString();
        return revStr.equals(numStr);
    }
}
