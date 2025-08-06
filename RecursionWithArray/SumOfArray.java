public class SumOfArray {
    static int doSum(int arr[], int index) {
        if (arr.length == index) {
            return 0;
        }
        return doSum(arr, index + 1) + arr[index];
    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 10, 20, 30, 40, 50 };
        int sum = doSum(arr, 0);
        System.out.println(sum);
    }

}
