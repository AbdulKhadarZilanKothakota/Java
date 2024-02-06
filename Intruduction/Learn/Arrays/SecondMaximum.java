import java.util.Scanner;

class Main{
    static int SecondMaxi(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]<max1){
                max2=arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Values : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The second Maximum number is : ");

        int result = SecondMaxi(arr);
        System.out.println(result);
    }
}