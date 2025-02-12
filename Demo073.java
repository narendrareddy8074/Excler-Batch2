public class Demo073 {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 3, 2, 8, 6 };
        int arr1[] = { 5, 7, 3, 2, 8, 7, 6 };
        
        System.out.println("Checking duplicates in arr:");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is: " + arr[j]);
                }
            }
        }
        
        System.out.println("Checking duplicates in arr1:");
        int m = arr1.length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr1[i] == arr1[j]) {
                    System.out.println("Duplicate element is: " + arr1[j]);
                }
            }
        }
    }
}