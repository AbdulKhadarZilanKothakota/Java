class Main
{
    public static void main(String[] args)
    {
        int i=123;
        int j=666;
/*
        if(i>j)
        {
            System.out.println("Greatest number is i "+i);
        }
        else if(i<j)
        {
            System.out.println("Greatest number is j "+j);
        }
        else
        {
            System.out.println("Both are equal");
        }
*/

        // using function
    
        System.out.println("largest number :"+Gr(i,j));
    }
        public static int Gr(int i,int j)
        {
            return (i>j)? i:j;
        }

}