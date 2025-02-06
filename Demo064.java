public class Demo064 {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 8, 6, 2 };
        int n = arr.length;
        int a = arr[0];
        int b = arr[n - 1];

        a = a + b;
        b = a - b;
        a = a - b;

        arr[0] = a;
        arr[n - 1] = b;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
