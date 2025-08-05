public class EvenOdd {
    // static void countEvenOdd(int n, int even, int odd) {
    // if (n == 0) {
    // System.out.println("Even : " + even);
    // System.out.println("Odd :" + odd);
    // return;
    // }
    // if (n % 2 == 0) {
    // even++;
    // } else {
    // odd++;
    // }
    // countEvenOdd(n - 1, even, odd);
    // }
    static int[] countEvenOdd(int n) {
        int arr[] = { 0, 0 };
        if (n == 0) {
            return arr;
        }
        int[] res = countEvenOdd(n - 1);
        if (n % 2 == 0) {
            res[0]++;
        } else {
            res[1]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int ans[] = countEvenOdd(100);
        System.out.println(ans[0]);
    }

}
