public class SumNatural {
    static void sumN(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sum += num;
        sumN(num - 1, sum);
    }

    static int sumN(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumN(num - 1);
    }

    public static void main(String[] args) {
        System.out.println();
        // sumN(10, 0);
        System.out.println(sumN(10));
    }

}
