import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] arr = new int[]{1,2,3,4,5,6,5};
//        Random random = new Random();
//        for(int i =0;i<arr.length;i++){
//            arr[i]=random.nextInt(100);
//        }
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println(Arrays.toString(arr));
    }

}






