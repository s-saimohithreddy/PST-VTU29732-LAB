import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task4
 {

    public static List<int[]> chunkArray(int[] arr, int k) {
        List<int[]> chunks = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i += k) {
            int end = Math.min(arr.length, i + k);
            chunks.add(Arrays.copyOfRange(arr, i, end));
        }

        return chunks;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        List<int[]> result = chunkArray(numbers, k);
        
        System.out.println("Chunks of size " + k + ":");
        for (int[] chunk : result) {
            System.out.println(Arrays.toString(chunk));
        }
    }
}