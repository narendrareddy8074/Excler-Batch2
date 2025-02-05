public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        if (arr.length >= 1) {
            int firstElement = arr[0]; 
            int lastElement = arr[arr.length - 1]; 
            int sum = firstElement + lastElement;
            System.out.println("Sum of the 1st and last elements: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
