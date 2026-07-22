public class AllOrderedPairs {

    public static void printAllPairs(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("All Ordered Pairs:");
        printAllPairs(numbers);
    }
}