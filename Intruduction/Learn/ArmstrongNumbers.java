import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=sc.nextInt();
        for(int i=5;i<n;i++)
        {
        int temp=i;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            sum+=Math.pow(rem,3);
            temp=temp/10;
        }
        if(sum==i)
        {
        System.out.print(i+" ");
        }
        }
    }
}