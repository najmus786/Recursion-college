public class Armstrong {
    static void arm(int num, int digit, int ans, int inputNum) {
        if (num == 0) {
            if (ans == inputNum) {
                System.out.println("armstrong");
            } else {
                System.out.println("not arm");
            }
            return;
        }
        arm(num / 10, digit, ans + (int) Math.pow(num % 10, digit), inputNum);
    }

    static int arms(int num) {
        int ans = 0;
        int digit = String.valueOf(num).length();
        return arms(num, ans, digit);
    }

    static int arms(int num, int ans, int digit) {
        if (num == 0) {
            return ans;
        }
        return arms(num / 10, ans + (int) Math.pow(num % 10, digit), digit);
    }

    public static void main(String[] args) {
        int inputNum = 153;
        System.out.println();
        // digit in a number=String.valueOf(num).length()
        // arm(inputNum, String.valueOf(inputNum).length(), 0, inputNum);
        int arm = arms(inputNum);
        if (inputNum == arm) {
            System.out.println("armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
