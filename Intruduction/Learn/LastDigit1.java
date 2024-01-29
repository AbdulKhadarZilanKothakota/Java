import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scan.nextInt();

        if(num%10==0){
            System.out.println("Last digit is zero");
        }
        else{
            System.out.println("Last digit is not a zero");
        }
    }
}