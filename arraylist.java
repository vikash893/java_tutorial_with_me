import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
    // System.out.println(arr.size());
    arr.add(12);
    // System.out.println(arr.size());
    arr.add(23);
    // System.out.println(arr.size());
    arr.add(34);
    // System.out.println(arr.size());
    // System.out.println(arr);
    // System.out.println(arr.get(2));


        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }
    }
}


