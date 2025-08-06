public class SumOfDigit {
    static void sumOfDigit(int num, int sum) {
        if (num <= 0) {
            System.out.println(sum);
            return;
        }
        sum += num % 10;
        sumOfDigit(num / 10, sum);
    }

    static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return num%10+sumOfDigit(num/10);
    }

    public static void main(String[] args) {
        // sumOfDigit(123, 0);
        System.out.println();
        System.out.println(sumOfDigit(23424));
    }

}
