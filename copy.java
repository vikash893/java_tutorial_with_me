import java.util.Arrays; 
public class copy {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr1[] = Arrays.copyOf(arr , arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
