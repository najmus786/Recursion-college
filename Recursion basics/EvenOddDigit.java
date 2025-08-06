public class EvenOddDigit {
    static void evenAndOddDigit(int num, int odd, int even) {
        if (num == 0) {
            System.out.println("Odd :" + odd);
            System.out.println("Even: " + even);
            return;
        }
        if ((num % 10) % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        evenAndOddDigit(num / 10, odd, even);
    }

    static int[] evenOdd(int num) {
        int arr[] = { 0, 0 };
        if (num == 0) {
            return arr;
        }
        int res[] = evenOdd(num / 10);
        if (num % 2 == 0) {
            res[0]++;
        } else {
            res[1]++;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println();
        evenAndOddDigit(123, 0, 0);
        System.out.println(evenOdd(12345)[1]);
    }

}
