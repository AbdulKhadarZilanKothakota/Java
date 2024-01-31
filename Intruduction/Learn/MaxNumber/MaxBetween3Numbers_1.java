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
        

        int max = Math.max(Math.max(n1,n1),n3);

               System.out.println("MAximim Number is : "+max);
    }
}