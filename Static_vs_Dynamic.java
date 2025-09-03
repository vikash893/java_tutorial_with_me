import java.lang.reflect.Array;
import java.util.Arrays;

class Static_vs_Dynamic{
    public static void main(String args[]){
        int arr[] = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 9;
        arr[4] = 16;
        int arr1[] = {0,0,0,0,0};

        for(int i = 0 ; i < arr.length ; i++){
            arr1[i] = arr[i] * arr[i];
        }

        System.out.println(Arrays.toString(arr1));

       // static initialization

       
        int arr2[] = {10,20,30,40,50};
        int arr3[] = {0,0,0,0,0};

        for(int i = 0 ; i < arr2.length ; i++){
            arr3[i] = arr2[i] * arr2[i];
        }

        System.out.println(Arrays.toString(arr3));
    }
}
