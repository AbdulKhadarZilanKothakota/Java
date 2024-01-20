class Main
{
    public static void main(String[] args)
    {
        int i=12;
        int j=123;
        int k=1;

        if(i>j && i>k)
        {
            System.out.println("i is greater:"+i);
        }
        else if(j>i && j>k)
        {
            System.out.println("j is greater:"+j);
        }
        else if(k>i && k>j)
        {
            System.out.println("k is greater:"+k);
        }
        else if(i==j && i==k && j==k)
        {
            System.out.println("All numbers are equal");
        }
        else
        {
            System.out.println("Two are equal numbers");
        }
    }
}