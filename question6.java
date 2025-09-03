import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class question6 {
    public static void main(String[] args) {
        Integer arr[] = {1,3,4,6,8,2,9};
        String arr1[] = {"Hello " , "Hi" , "Here" };
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> s_al = new ArrayList<>(Arrays.asList(arr1));
        // System.out.println("Unsorted array : "+al);

        Collections.sort(al);
         Collections.sort(s_al);

        System.out.println("sorted array: "+al);
        System.out.println("sorted array: "+s_al);

    }
}
