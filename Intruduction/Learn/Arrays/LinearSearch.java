// linear search or Finding index for user input number

import java.util.Scanner;

class Main{
    static int NumberIndex(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
       
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the input number for searching: ");
        int k = scan.nextInt();
        System.out.println("The searching number index is  : ");

        int result = NumberIndex(arr,k);
        System.out.println(result);
    }
}