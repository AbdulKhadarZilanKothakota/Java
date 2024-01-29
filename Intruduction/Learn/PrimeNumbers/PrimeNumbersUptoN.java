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

    static void PrimeNumbers(int n1){
        int count=0;
        for(int i=2;count<n1;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int n1 = scan.nextInt();
        

        PrimeNumbers(n1);
    }
}