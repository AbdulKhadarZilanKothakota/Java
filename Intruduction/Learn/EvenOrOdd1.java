import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=scr.nextInt();
        System.out.println("Even numbers:");
        /* using while loop
        int i=2;
        while(i<=n)
        {
        if(i%2==0)
        {
            System.out.print(i+" ");
            i=i+2;
        }
        }
        */
       // using for loop
       for(int i=1;i<=n;i++)
       {
        if(i%2==0)
        {
            System.out.print(i+" ");
        }
       }
       System.out.println();
       System.out.println("Odd numbers:");
       for(int i=1;i<=n;i++)
       {
        if(i%2!=0)
        {
            System.out.print(i+" ");
        }
       }
    }
}