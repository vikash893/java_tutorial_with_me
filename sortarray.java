import java.util.Arrays;
public class sortarray {
    public static void main(String[] args) {
        int arr[] = {7,2,9,4,1};
        Arrays.sort(arr);

        int left = 0 ;
        int right = arr.length -1 ; 
        int target = 4 ;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                System.out.println("Found target at index: " + mid);
                return;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println("Target not found.");
    }
}
