
        import java.util.Arrays;
        public class ImmutableSort {
    public static void main(String[] args) {

        int[] a = {0, 0, 3};
        int[] b = {0, 0, 0};
        if (a[0]==a[1]||a[1]==a[2]||a[0]==a[2]){
            if (a[0]==a[1]){
                if (a[0]>a[2]){
                    b[0]=a[2];
                    b[1]=a[1];
                    b[2]=a[0];
                }else{
                    b[0]=a[0];
                    b[1]=a[1];
                    b[2]=a[2];
                }
            }else if(a[1]==a[2]){
                if (a[0]>a[1]){
                    b[0]=a[2];
                    b[1]=a[1];
                    b[2]=a[0];
                }else{
                    b[0]=a[0];
                    b[1]=a[1];
                    b[2]=a[2];
                }
            }else{
                if (a[1]>a[2]){
                    b[0]=a[2];
                    b[1]=a[2];
                    b[2]=a[1];
                }else{
                    b[0]=a[1];
                    b[1]=a[0];
                    b[2]=a[2];
                }
            }
        }else if (a[0] < a[1] && a[0] < a[2]){
            b[0] = a[0];
            if (a[1]<a[2]){
                b[1] = a[1];
                b[2] = a[2];
            }else{
                b[1] = a[2];
                b[2] = a[1];
            }
        }else if((a[0]<a[1] && a[0]>a[2]) || (a[0]<a[2]&&a[0]>a[1])){
            b[1] = a[0];
            if (a[1]<a[2]){
                b[0] = a[1];
                b[2] = a[2];
            }else{
                b[0] = a[2];
                b[2] = a[1];
            }
        }else{
            b[2] = a[0];
            if (a[1]<a[2]){
                b[0] = a[1];
                b[1] = a[2];
            }else{
                b[0] = a[2];
                b[1] = a[1];
            }
        }
        System.out.println(Arrays.toString(a)+" | "+ Arrays.toString(b));
    }
}
