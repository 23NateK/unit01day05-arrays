// good
import java.util.Arrays;
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int a1 = a[0];
        int a2 = a[1];
        int a3 = a[2];
        if (a1 < a2 && a1 < a3){
            a[0] = a1;
            if (a2<a3){
                a[1] = a2;
                a[2] = a3;
            }else{
                a[1] = a3;
                a[2] = a2;
            }
        }else if((a1<a2 && a1>a3) || (a1<a3&&a1>a2)){
            a[1] = a1;
            if (a2<a3){
                a[0] = a2;
                a[2] = a3;
            }else{
                a[0] = a3;
                a[2] = a2;
            }
        }else{
            a[2] = a1;
            if (a2<a3){
                a[0] = a2;
                a[1] = a3;
            }else{
                a[0] = a3;
                a[1] = a2;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
