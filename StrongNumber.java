//A strong number is a number that equals the sum of the factorials of its digits
public class StrongNumber {
    static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    static void strong(int num, int sum, int copy) {
        if (num == 0) {
            if (copy == sum) {
                System.out.println("strong number");
            } else {
                System.out.println("Not a Strong number");
            }
            return;
        }
        int fact = fact(num % 10);
        sum += fact;
        strong(num / 10, sum, copy);
    }

    static int strongRe(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        sum += fact(num % 10);
        return strongRe(num / 10, sum);
    }

    public static void main(String[] args) {
        System.out.println();
        strong(145, 0, 145);
        System.out.println(strongRe(143, 0));
    }
}
