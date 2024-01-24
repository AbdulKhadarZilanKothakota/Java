import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter  start number:");
        int i=scr.nextInt();
        System.out.println("Enter end number:");
        int n=scr.nextInt();
        int sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}