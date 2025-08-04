public class Palindrom {
    static boolean isPalindrome(int num, int org, int reverse) {
        if (num == 0) {
            if (org == reverse) {
                return true;
            } else {
                return false;
            }
        }
        return isPalindrome(num / 10, org, reverse * 10 + num % 10);
    }
    static int palindrome(int num){
        if(num==0){
            return 0;
        }
        int r=num%10;
        int p=palindrome(num/10);
        

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(141, 141, 0));
    }

}
