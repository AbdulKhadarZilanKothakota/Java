import java.util.Scanner;

class Main{

    static String isPrime(int n){
         
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return "Not Prime";
            }
            
        }
        return "Prime";
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scan.nextInt();

        String result = isPrime(n);
        System.out.println(result);
    }
}