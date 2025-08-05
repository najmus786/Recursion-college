public class ZerosInNumber {
    static void noZero(int num, int count) {
        if (num == 0) {
            System.out.println("count Of Zero: " + count);
            return;
        }
        int newC = num % 10 == 0 ? 1 : 0;
        noZero(num / 10, count + newC);
    }

    static int countZero(int num) {
        if (num == 0) {
            return 0;
        }
        int count = (num % 10 == 0 ? 1 : 0) + countZero(num / 10);
        return count;
    }

    public static void main(String[] args) {
        // noZero(100, 0);
        System.out.println();
        System.out.println(countZero(1203040000));
    }

}
