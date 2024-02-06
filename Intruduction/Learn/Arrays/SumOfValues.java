import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The Sum of Array Values is : ");
        int sum =0;
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            sum = sum + arr[i];
            
        }
        System.out.println(sum);
    }
}