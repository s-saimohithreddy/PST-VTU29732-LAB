import java.util.Arrays;

public class  task5 {

    public static int findKthSmallest(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid value for k or array is empty.");
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        return sortedArr[k - 1];
    }

    public static void main(String[] args) {
        int[] numbers = {7, 10, 4, 3, 20, 15};
        int k = 3;

        int result = findKthSmallest(numbers, k);
        System.out.println("The " + k + "rd smallest element is: " + result);
    }
}