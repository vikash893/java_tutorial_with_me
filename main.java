// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public int findMin(int[] nums) {
        int left = 0 ;
        int right = nums.length -1 ;
        int ans = -1 ;

        while(left <= right){
            int mid = left + (right-left)/2 ;
            int end = nums[nums.length-1];


            if(nums[mid] <= end){
                ans = mid ; 
                right = mid -1 ;
            }
            else {
                left = mid +1 ;
            }
        }
        return nums[ans] ;
    }
    public static void main(String[] args) {
        // create a function that find  a smallest number in a unshorted array
        
        int arr1[] = {5,6,7,1,2,3,4};
        Main obj = new Main();
        System.out.println(obj.findMin(arr1));
        
    }
}
