//sorting array without using predefined methods

public class Demo074 {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 7, 1 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +  " ");
        }
    }
}