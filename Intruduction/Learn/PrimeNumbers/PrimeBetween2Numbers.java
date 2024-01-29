import java.util.Scanner;

class Main{

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void PrimeNumbers(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int n1 = scan.nextInt();
        System.out.print("Enter Number2 : ");
        int n2 = scan.nextInt();

        PrimeNumbers(n1,n2);
    }
}