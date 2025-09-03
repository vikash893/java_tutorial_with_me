import java.util.ArrayList;
import java.util.Arrays;


public class question5 {
    public static void main(String[] args) {
        String arr[] = {"A" , "B" , "C"};
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));

        System.out.println(al);

        String arr1[] = al.toArray(new String[0]);
        for(String name : arr1){
            System.out.println(name.toLowerCase());
        }

        
    }
}
