import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();

        int max;
        if(num1>num2){
            max=num1;
            System.out.println("Maximum Number is : " +max);
        }
        else{
            max=num2;
            System.out.println("Maximum Number is : " +max);
        }

    }
}