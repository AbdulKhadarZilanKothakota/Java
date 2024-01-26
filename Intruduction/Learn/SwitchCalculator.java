import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter these characters:+ - * /");
        char ch=scr.next().charAt(0);
        System.out.println("Enter first number:");
        int n1=scr.nextInt();
        System.out.println("Enter Second number:");
        int n2=scr.nextInt();
        int result=0;

        switch(ch)
        {
            case '+':
                result=n1+n2;
               // System.out.println(result);
            case '-':
                result=n1-n2;
               // System.out.println(result);
                break;
            case '*':
                result=n1*n2;
               // System.out.println(result);
                break;
            case '/':
                result=n1/n2;
                //System.out.println(result);
                break;
            default:
            System.out.println("invalid input");
        }
        System.out.println("result is:"+result);
    }
}