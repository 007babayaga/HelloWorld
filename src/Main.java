import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Roatate  An Array
        int [] arr = new int[]{1,2,3,4,5};
        int moves = arr.length/2;
        int max = arr.length-1;
        int temp;
        for(int i =0;i<moves;i++){
            temp=arr[i];
            arr[i] = arr[max-i];
            arr[max-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("ll");
    }
}






