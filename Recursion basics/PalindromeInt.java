public class PalindromeInt {
    static int palin(int num) {
        int reverse = 0;
        return newPalin(num, reverse);
    }

    static int newPalin(int num, int reverse) {
        if (num == 0) {
            return reverse;
        }
        reverse = reverse * 10 + num % 10;
        return newPalin(num / 10, reverse);
    }
    public static void main(String[] args) {
        int num = 121;
        int reversed = palin(num);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is palindrome: " + (num == reversed));
    }
}
