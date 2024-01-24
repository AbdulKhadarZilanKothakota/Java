class test
{
    static int sum(int n)
    {
        if(n>1)
        {
            return (n+sum(n-1));
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int add=0;
        int number=4;
        add=sum(number);
        System.out.println(add);
    }
}