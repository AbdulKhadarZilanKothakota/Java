import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter  upto n number:");
        int num=scr.nextInt();
    
        for(int j=2;j<=num;j++)
        {
            int count=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                count++;
            }       
             if(count==2)
            {
                System.out.print(j+" ");
            }
                
                
            
        }
    
    }
}