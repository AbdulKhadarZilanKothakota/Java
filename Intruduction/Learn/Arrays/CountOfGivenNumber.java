import java.util.Scanner;

class Main{
    static int countNumbers(int[] arr,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==k){
                count++;
            }
        }
        return count;
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
        System.out.print("Enter the input number to count : ");
        int k = scan.nextInt();
        System.out.println("The Count of repeted Numbers : ");

        int result = countNumbers(arr,k);
        System.out.println(result);
    }
}