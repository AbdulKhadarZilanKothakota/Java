class Main
{
    public static void main(String[] args)
    {
        int [] arr={5,9,2,8,3,7};
        int max=arr[0];
        int max1=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max1=max;
                max=arr[i];
            }
            else if(arr[i]>max1 && arr[i]!=max)
            {
                max1=arr[i];
            }
            sum=max+max1;
            
        }
        System.out.println(sum);
    }
}