import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scr.nextInt();
        
        int count=0;
        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                    count++;
            }       
                if(count==2)
                {
                    System.out.println("Prime NUmber");
                }
                else
                {
                    System.out.println("Not a prime number");
                }
            
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}