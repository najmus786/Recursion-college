public class PrimeOrNot {
    static void prime(int num, int i) {
        if(num==2){
            System.out.println("prime no.");
            return;
        }
        if (i == 2) {
            System.out.println("prime no.");
            return;
        }
        if (num % i == 0) {
            System.out.println("Not Prime");
            return;
        } else {
            prime(num, i - 1);
        }
    }
    static void primeWithHelper(int num){
        prime(num, num-1);
        return;
    }
    static boolean primeWithReturn(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        return primeWithHelp(num, num - 1);
    }

    static boolean primeWithHelp(int num, int i) {
        if (i == 1) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return primeWithHelp(num, i - 1);
    }

    public static void main(String[] args) {
        System.out.println();
        //prime(10, 9);
        //primeWithHelper(2);
        System.out.println(primeWithReturn(6));
    }

}
