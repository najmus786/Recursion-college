public class NumberToString {
    static void numberToString(int num, String ans) {
        if (num == 0) {
            System.out.println(ans);
            return;
        }
        String arr[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
        ans += arr[num % 10] + " ";
        numberToString(num / 10, ans);
    }

    static String numberToStr(int num) {
        if (num == 0) {
            return "";
        }
        String arr[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
        return numberToStr(num / 10) + arr[num % 10] + " ";
    }

    public static void main(String[] args) {
        System.out.println();
        numberToString(121, "");
        System.out.println(numberToStr(1426));
    }

}
