package BasicSorting;
import java.util.Arrays;
public class MajorityElelment {
    public static void main(String[] args) {
        int a[]={1,2,2,4,5,2,2,4};
        Arrays.sort(a);
        int num=a[a.length/2];
        System.out.println(num);
    }
}
