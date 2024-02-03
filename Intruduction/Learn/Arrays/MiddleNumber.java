import java.util.Scanner;
class Main{
    static int MiddleNumber(int[] arr){
     /*   int center = 0;
        for(int i=arr.length/2;i<=arr.length/2;i++){
            center = arr[i];
        }
        return center;
    */

        int center = arr[(arr.length -1)/ 2];
        return center;

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
        System.out.println("The Middle Number : ");

        int result = MiddleNumber(arr);
        
        System.out.println(result);
    }
}