import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter year:");
        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0)
        {
            System.out.println("Leap Year "+n);
        }
        else
        {
            System.out.println("Not a Leap Year "+n);
        }
    }
}