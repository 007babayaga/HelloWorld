import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(aaaa(new int[]{4,5,7,89,34,1})));
    }
    public static int[] aaaa(int[] jj){
        boolean flag = true;
        int temp;
        while (flag){
            flag=false;
            for(int i =0;i<jj.length-1;i++){
                if(jj[i]<jj[i+1]){
                    temp=jj[i];
                    jj[i]=jj[i+1];
                    jj[i+1]=temp;
                    flag=true;
                }
            }
        }
        return jj;
    }

}






