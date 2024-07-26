public class binarysearch {
    
    public static void main(String[] args) {
        int even[] = {2, 4, 6, 8, 10, 12};
        int odd[] = {1, 3, 5, 7, 9}; 

        binary(even, 6, 10); 
    }

    private static void binary(int[] arr, int size, int key) {
        int s = 0;
        int e = size - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2; 
            if (arr[mid] == key) {
                System.out.println("Index of " + key + " is " + mid);
                return; 
            }

            if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        System.out.println("Element " + key + " does not exist in the array.");
    }
}
