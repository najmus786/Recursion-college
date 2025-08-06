import java.util.Arrays;

public class OccurIndex {
    static int[] searchOcur(int arr[], int index, int val) {
        int count = 0;
        return helper(arr, index, val, count);
    }

    static int[] helper(int arr[], int index, int val, int count) {
        if (arr.length == index) {
            return new int[count];
        }
        if (arr[index] == val) {
            count++;
        }
        int[] ans = helper(arr, index + 1, val, count);
        if (arr[index] == val) {
            ans[count - 1] = index;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 90, 10, 100, 10 };
        System.out.println();
        int result[] = searchOcur(arr, 0, 10);
        System.out.println(Arrays.toString(result));
    }

}
