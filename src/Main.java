import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrange(new int[]{3,4,56,8,1})));
        int[][] arrrr = new int[][]{{1,2,3},{1,2,3,4},{5,6,7}};
        System.out.println(Arrays.deepToString(arrrr));
    }
    public static int[] arrange(int[] len){
        boolean flag = true;
        int temp=0;
        while (flag){
            flag=false;
            for(int i =0;i<len.length-1;i++){
                if(len[i]<len[i+1]){
                    temp=len[i];
                    len[i]=len[i+1];
                    len[i+1]=temp;
                    flag=true;
                }
            }
        }
        return len;
    }

}






