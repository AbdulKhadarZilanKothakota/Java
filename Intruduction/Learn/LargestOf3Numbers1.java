class Main
{
    public static void main(String[] args)
    {
        int a=1;
        int b=2;
        int c=2;
/*
        int temp;

        temp=(a>b)?a:b;
        temp=(temp>c)?temp:c;
        System.out.println(temp);
*/

        // single line

        int result=c>((a>b)?a:b)?c:((a>b)?a:b);
        System.out.println(result);


    }
}