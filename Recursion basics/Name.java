public class Name {
    static void name(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Najmus" + n);// pre-Logic
        name(n - 1);// n-1 recurrence call
        // post logic-backtracking
        System.out.println("Saquib" + n);
    }

    public static void main(String[] args) {
        name(5);
    }

}
