package telran.introduction;

public class Calculations {
    public static int sum(int par1, int par2)
    {
        return par1 + par2;
    }
    public static int dif(int par1, int par2)
    {
        return par1 - par2;
    }
    public static int mul(int par1, int par2)
    {
        return par1 * par2;
    }
    public static int div(int par1, int par2)
    {
        int res = -1;
        if (par2 != 0) {
            res = par1 / par2;
        }
        
        return res;
    }
    public static int sumOfDigits(int number)
    {
        int sum = 0;
        number = Math.abs(number);
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int maxDigit(int number)
    {
        int max = 0;
        number = Math.abs(number);
        while (number != 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }
    public static boolean isDividedOn(int source, int divider)
    {
        boolean res = false;
        if (divider != 0) {
            res = (source % divider == 0);
        }

        return res;
    }
}
