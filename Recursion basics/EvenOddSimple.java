public class EvenOddSimple {
    public static void main(String[] args) {
        int n = 110;
        int even = 0;
        int odd = 0;
        if (n % 2 == 0) {
            even = n / 2;
            odd = n / 2;
        } else {
            even = (n - 1) / 2;
            odd = even + 1;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

}
