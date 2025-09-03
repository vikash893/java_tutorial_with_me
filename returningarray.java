class returnarray{
    public static void main(String[] args) {
        int num = 17;
        if (isPrime(num)) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }

    static boolean isPrime(int num){
        if(num < 2){
            return false; 
        }
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}