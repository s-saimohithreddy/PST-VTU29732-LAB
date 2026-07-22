public class task2 {
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }

        return binarySearchRecursive(arr, target, left, mid - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 23, 34, 45, 56, 67, 78, 89};
        int targetValue = 56;

        int index = binarySearchRecursive(numbers, targetValue, 0, numbers.length - 1);

        if (index != -1) {
            System.out.println("Found target at index " + index + " -> Value: " + numbers[index]);
        } else {
            System.out.println("Target value " + targetValue + " is not in the array.");
        }
    }
}