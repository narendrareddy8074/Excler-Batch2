public class Demo062 {
    public static void main(String[] args) {
        // Sample array
        int[] arr = {10, 20, 30, 40, 50};

        // Check if the array has at least two elements
        if (arr.length >= 2) {
            System.out.println("1st element: " + arr[0]);
            System.out.println("2nd element: " + arr[1]);
            System.out.println("Last element: " + arr[arr.length - 1]);
        } else {
            System.out.println("Array doesn't have enough elements.");
        }
    }
}
