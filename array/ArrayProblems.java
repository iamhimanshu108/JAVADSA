package array;

public class ArrayProblems {
    // static double getAverage(int[] arr){
    //     double sum = 0;
        
    //     for(int i : arr){
    //         sum += i;
    //     }
    //     int size = arr.length;
    //     double avg = sum/size;
    //     return avg;
    // }

    static int[] mutiplyBy10(int[] arr){
        
        int size = arr.length;
        int[] newArray = new int[size];

        for( int i = 0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
           return newArray;
        
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int ans[] = mutiplyBy10(arr);
        System.out.println("Printing Ans");
        for(int i:ans){
            System.out.println(i);
        }
    }

    // public static void main(String[] args){
    //     int[] arr = {1,2,3,4,5};
    //     //System.out.println(getAverage(arr));
        
    // }
}
