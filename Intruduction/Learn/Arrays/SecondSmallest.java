// First Smallest Number 
// Second Smallest Number 
// Thier sum

import java.util.Scanner;
class Main{
    static int[] SmallestNumber(int[] arr){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
            }
            else if(min2 > arr[i] && arr[i] != min1){
                min2=arr[i];
            }
           
        }
        return new int[]{min1,min2,min1+min2};
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
        System.out.println("The Smallest Number : ");

        int[] result = SmallestNumber(arr);
        System.out.println("First smallest "+result[0]+" second smallest "+result[1]+" Their Sum "+result[2]);
    }
}