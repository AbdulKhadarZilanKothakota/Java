import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("The Reversed Array values are : ");
        for(int i=arr.length-1;i>=0;i--){
           System.out.println(arr[i]);
        }
    }
}