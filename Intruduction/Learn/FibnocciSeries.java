import java.util.Scanner;
class Fibnocci
{
    void show()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter n number:");
        int n=scr.nextInt();
        int a=0; int b=1;
        if(n>=1)
        {
            System.out.print("0 ");
        }
        if(n>=2)
        {
            System.out.print("1 ");
        }
        for(int i=3;i<=n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
class Main
{
    public static void main(String[] args)
    {
        Fibnocci f=new Fibnocci();
        f.show();
    }
}
