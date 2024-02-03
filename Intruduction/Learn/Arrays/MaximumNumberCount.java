import java.util.Scanner;

class Main{
    static int MaxiNumberCount(int[] arr){
        int maxi = Integer.MIN_VALUE;int count = 0;
        for(int i=0;i<arr.length;i++){
            
            if(maxi<arr[i]){
                maxi=arr[i];
                count = 1;
                
            }
            else if(maxi==arr[i]){
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
        
        System.out.println("The Count of Maximum Number : ");

        int result = MaxiNumberCount(arr);
        System.out.println(result);
    }
}