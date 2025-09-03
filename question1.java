import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("vikash");
        arr.add("rahul");
        arr.add("vansh");
        arr.add("yash");
        arr.add("vansh");

        arr.set(3, "deepak");

        for(int i = 0 ; i< arr.size() ; i++){
            System.out.println(arr.get(i));
        }
    }
}
