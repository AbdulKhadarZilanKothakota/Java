class Main
{
    public static void main(String[] args)
    {
        int n=123456, reverse=0;
        while(n!=0)
        {
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println(reverse);


        // using for loop
        for(;n!=0;)
        {
            int remainder=n%10;
            reverse=reverse*10+remainder;
            n=n/10;
        }
        System.out.println(reverse);
    }
}