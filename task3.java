public class task3 {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {34, 15, 88, 2, 51, -7, 19};

        int minElement = findMin(numbers);

        System.out.println("The minimum element in the array is: " + minElement);
    }
}