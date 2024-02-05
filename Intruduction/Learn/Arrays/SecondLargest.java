// first largest number
// second largest number
// their sum

import java.util.Scanner;
class Main{
    static int[] SecondlargestNumber(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(max2<arr[i] && max1>arr[i]){
                max2=arr[i];
            }
        }
        int sum=max1+max2;
        return new int[]{max1,max2,sum};
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The largest Number : ");

        int[] result = SecondlargestNumber(arr);
        System.out.println("First largest "+result[0]+" second largest "+result[1]+" Their Sum "+result[2]);
        
    }
}