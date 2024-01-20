import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=scr.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+num+" is : "+fact);
    }
}