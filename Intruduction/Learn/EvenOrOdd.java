import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=scr.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("odd number");
        }
    }
}