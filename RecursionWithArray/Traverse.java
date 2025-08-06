
public class Traverse {
    static void traverse(int a[], int index) {
        if (index == a.length) {
            return;
        }
        System.out.println(a[index++]);
        traverse(a, index);
    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] = { 1, 2, 3, 4, 5 };
        traverse(arr, 0);
    }
}
