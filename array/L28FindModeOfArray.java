import java.util.HashMap;

public class L28FindModeOfArray {
    static int getMode(int arr[]){
        HashMap<Integer, Integer> freq =  new HashMap<>();
        
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);

        }

        int mode = arr[0];
        for(int num: freq.keySet()){
            System.out.println(num + "-> " + freq.get(num));
            if(freq.get(num) > freq.get(mode)){
                mode = num;
            }
        }
        return mode;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5,1,4,5};
        System.out.println("Mode: " + getMode(arr));
    
}
}