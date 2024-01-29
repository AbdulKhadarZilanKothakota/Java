import java.util.Scanner;

class Main{

    static String isPrime(int n){
        
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return "Prime";
        }
        else{
            return "not Prime";
        }
        
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = scan.nextInt();

        String result = isPrime(n);
        System.out.println(result);
    }
}