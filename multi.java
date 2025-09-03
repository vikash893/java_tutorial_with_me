import java.util.Arrays;

public class multi {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        

        for (int row = 0; row < arr.length; row++) {
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = (row+1)*(col+1);
            }
        }
        for(int row = 0 ; row< arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
