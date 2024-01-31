import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int n1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = scan.nextInt();
        System.out.print("Enter Third Number : ");
        int n3 = scan.nextInt();
        System.out.print("Enter Fourth Number : ");
        int n4 = scan.nextInt();

        int max = (n1>n2 && n1>n3 && n1>n4)?n1:(n2>n3 && n2>n4)?n2:(n3>n4?n3:n4);

               System.out.println("MAximim Number is : "+max);
    }
}