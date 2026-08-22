public class L28shiftarrayelements {
    // Method to right rotate array elements by one position
    static void shiftbyOne(int[] arr){
        // Step 1: Get the length of the array
        int n = arr.length;
        
        // Step 2: Store the last element in a temporary variable
        // This ensures we don't lose the last element during shifting
        int temp = arr[n-1];

        // Step 3: Shift all elements one position to the right
        // Loop from the last index to 1 (not 0 to avoid overwriting)
        for(int i=n-1; i>0; i--){
            // Copy the previous element to current position
            arr[i] = arr[i-1];
        }
        
        // Step 4: Place the last element (stored in temp) at the first position
        arr[0] = temp;
    }
    
    public static void main(String[] args) {
        // Create a sample array
        int arr[] = {1,2,3,4,5,6,7};
        
        // Call the shift method to rotate array to the right
        shiftbyOne(arr);
        
        // Print the rotated array
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
