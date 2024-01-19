class Main
{
    public static void main(String[] args)
    {
        int [] arr={1,2,-3,-4,4};

        int sum=0,abssum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            abssum=abssum+Math.abs(arr[i]);
        }

        System.out.println("sum : "+sum);
        System.out.println("Absolute sum : "+abssum);
    }
}