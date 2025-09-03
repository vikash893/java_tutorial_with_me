import java.util.ArrayList;

public class question4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1 ; i <= 10 ; i++){
            al.add(i);
        }
        System.out.println(al);
        System.out.println(al.contains(5));


        if(al.indexOf(7)== al.lastIndexOf(7)){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }


    }
}
