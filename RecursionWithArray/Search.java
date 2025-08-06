public class Search {
    static int search(int arr[], int index, int val) {
        if (arr.length == index) {
            return -1;
        }
        if (arr[index] == val) {
            return index;
        }
        return search(arr, index + 1, val);
    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 90, 100, 30, 88, 555,88,88 };
        int val = 30;
        int index = search(arr, 0, val);
        System.out.println(index >= 0 ? "Found" : "Not Found");
    }

}
