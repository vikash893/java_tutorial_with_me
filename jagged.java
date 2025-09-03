public class jagged {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[2]; 
        arr[1] = new int[4]; 
        arr[2] = new int[3]; 

        int num = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = num++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
