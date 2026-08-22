

public class L27arrayproblems {
    // static double getAverage(int[] arr){
    //     double sum = 0;
        
    //     for(int i : arr){
    //         sum += i;
    //     }
    //     int size = arr.length;
    //     double avg = sum/size;
    //     return avg;
    // }

    // static int[] mutiplyBy10(int[] arr){
        
    //     int size = arr.length;
    //     int[] newArray = new int[size];

    //     for( int i = 0; i<size; i++){
    //         int element = arr[i];
    //         int newElement = element * 10;
    //         newArray[i] = newElement;
    //     }
    //        return newArray;
        
    // }

    // public static void main(String[] args){
    //     int arr[] = {1,2,3,4,5};
    //     int ans[] = mutiplyBy10(arr);
    //     System.out.println("Printing Ans");
    //     for(int i:ans){
    //         System.out.println(i);
    //     }
    // }

    // public static void main(String[] args){
    //     int[] arr = {1,2,3,4,5};
    //     //System.out.println(getAverage(arr));
        
    // }


    //

    // Search for Element in Array linear Search

    // static boolean findTarget(int arr[], int target){
    //     for(int i =0; i<arr.length; i++){
    //         if(arr[i] == target){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     int arr[] = {1,3,4,5,678,89,323};
    //     boolean ans = findTarget(arr, 12);
    //     System.out.println(ans);

        
    // }


    // Find The Maximum Element Of An Array

    // static int getMaximum(int[] arr){
    //     int maxi = arr[0];
    //      for(int i=0; i <arr.length; i++){
    //         maxi = Math.max(maxi, arr[i]);
    //      }
    //      return maxi;
        
    // }

    // public static void main(String[] args) {
    //     int arr[]  = {1,3,4,6,78,97,0,6};
    //     System.out.println(getMaximum(arr));
    // }


    // // Find The Maximum Element Of An Array

    // static int getMaximum(int[] arr){
    //     int maxi = arr[0];
    //      for(int i=0; i <arr.length; i++){
    //         if(arr[i] >maxi){
    //             maxi = arr[i];
    //         }
    //      }
    //      return maxi;
        
    // }

    // public static void main(String[] args) {
    //     int arr[]  = {1,3,4,6,78,97,0,6};
    //     System.out.println(getMaximum(arr));
    // }



    // // Postive and Negative Sum

    //     static int[] posNegSum(int[] arr){
    //         int posSum = 0;
    //         int negSum = 0;

    //         for(int i = 0; i <arr.length; i++){
    //             if(arr[i] >0){
    //                 posSum = posSum + arr[i];
    //             }
    //             else {
    //                 negSum = negSum + arr[i];
    //             }

    //         }
    //         int ans[] = {posSum, negSum};
    //         return ans;

    //     }

    //     public static void main(String[] args) {
    //         int arr[] = {1,2,3,4,5,6,-2,4,6};
    //         int ans[] = posNegSum(arr);
    //         System.out.println("Postive sum" + ans[0]);
    //         System.out.println("Negative sum " + ans[1]);
    //     }







    // static int[] getZeroOneCount(int arr[]){
    //     int zeroCount =0;
    //     int oneCount = 0;

    //     for (int i = 0; i<arr.length; i++){
    //         if(arr[i] == 0){
    //             zeroCount++;
    //         }
    //         else{
    //             oneCount++;
    //         }
    //     }
    //     int ans[] = {zeroCount, oneCount};
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,0,1,0,0,1,1};
    //     int ans[] = getZeroOneCount(arr);
    //     System.out.println(ans[0]);
    //     System.out.println(ans[1]);

    // }

    static int getUnsortedElement(int[] arr){
        for(int  i = 0; i <arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,6};
        System.out.println(getUnsortedElement(arr));

    }



    
}
