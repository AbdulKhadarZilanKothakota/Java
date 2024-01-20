class FibnocciRecursion
{
    static int a=0,b=1,c,i=10;
    static void show(int i)
    {
        if(i>=1)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            show(i-1);
        }
    }
    public static void main(String[] args)
    {
        System.out.print(a+" "+b);
        show(i-2);
    }
}