import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=scr.nextLine();
        int n=s.length();
        for(int i=n;i>0;--i)
        {
            char reverse=s.charAt(i-1);
            System.out.print(reverse);
        }
    }
}