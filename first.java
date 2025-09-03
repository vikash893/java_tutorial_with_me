public class first {
    int arr[] = {1,2,3,4,5};
    int target = 5 ; 

    int left = 0 ;
    int right = arr.length-1 ;

    while(left < right){
        int mid = left + (right - left)/2 ; 

        if(arr[mid] + arr[mid+1]  == target){
            System.out.println(mid + mid+1);
        }else if(left < right){
            left = mid +1 ;
        }else{
            right = mid -1 ;
        }
    }
}
