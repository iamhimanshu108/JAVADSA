public class L28PrintExtremeAlternateManner {
    static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <=j){
            System.out.println(arr[i]);
            i++;
            System.out.println(arr[j]);
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        printAlternate(arr);
        
    }
}
