public class task {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

           
            if (arr[mid] == target) {
                return mid; 
            }
       
            if (arr[mid] < target) {
                left = mid + 1;
            } 
      
            else {
                right = mid - 1;
            }
        }

    
        return -1;
    }

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int targetValue = 40;

     
        int index = binarySearch(numbers, targetValue);

       
        if (index != -1) {
            System.out.println("Element " + numbers[index] + " found at index: " + index);
        } else {
            System.out.println("Element " + targetValue + " was not found in the array.");
        }
    }
}