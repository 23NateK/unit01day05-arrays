// good
import java.util.Arrays;
public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        Arrays.toString(a);
        if (a[0]<a[1]&&a[0]<a[2]){
            if (a[1]>a[2]){
                System.out.println(a[1]-a[0]);
            }else{
                System.out.println(a[2]-a[0]);
            }
        }else if (a[1]<a[0]&&a[1]<a[2]){
            if (a[0]>a[2]){
                System.out.println(a[0]-a[1]);
            }else{
                System.out.println(a[2]-a[1]);
            }
        }else{
            if (a[1]>a[0]){
                System.out.println(a[1]-a[2]);
            }else{
                System.out.println(a[0]-a[2]);
            }
        }
    }
}
