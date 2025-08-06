public class Occur {
    static int searchCount(int arr[], int index, int val) {
        if (arr.length == index) {
            return 0;
        }
        int count = searchCount(arr, index + 1, val);
        if (arr[index] == val) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 90, 100, 30, 88, 555, 88, 88,88 };
        int val = 88;
        int index = searchCount(arr, 0, val);
        System.out.println(index);
    }

}
