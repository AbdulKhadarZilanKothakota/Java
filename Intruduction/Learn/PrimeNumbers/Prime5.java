import java.util.Scanner;

class Main{

    static boolean isPrime(int n){
         
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scan.nextInt();

        boolean result = isPrime(n);
        System.out.println(result);
    }
}