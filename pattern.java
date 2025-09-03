class pattern {
    public static void main(String[] args) {
        int row = 5;
        int col = 6;
        

    // print rectange 
    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < col; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }




    // print tringle 

    /*
     *        *
     *        * * 
     *        * * * 
     *        * * * * 
     * 
     */


    // for(int i = 0 ; i < row ; i++){   
    //     for(int j = 0 ; j <= i ; j++){
    //         System.out.print("* ");  
    //     }                           
    //     System.out.println();         
    //     }      
    
    


    // print hollow rectangle 


    /*
     * * * * *
     *       *
     * * * * *
     */


    for (int i = 0; i <= row; i++) {
    for (int j = 0; j <= col; j++) {
        if (i == 0 || i == row || j == 0 || j == col) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println(); // Move to the next line after each row
}                                                                                
    }
}                                         
