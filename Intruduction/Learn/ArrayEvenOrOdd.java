import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter size of an Array:");
        int n=scr.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=scr.nextInt();
        }
        System.out.print("Even numbers:");
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]%2==0)
        {
            System.out.print(arr[i]+" ");
        }
        }
        System.out.println();
        System.out.print("Odd numbers:");
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]%2!=0)
        {
            System.out.print(arr[i]+" ");
        }
        }
    }
}