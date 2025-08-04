public class Factorial {
    static void fact(int num, int result) {
        if (num == 1) {
            System.out.println(" Fact is : " + result);
            return;
        }
        fact(num - 1, result * num);
    }

    public static void main(String[] args) {
        fact(5, 1);
    }
}
