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
        System.out.println("The Max of Array Values is : ");

        
        long res = Abdul.Maxi(arr);
        System.out.println(res);
    }
}


class Abdul{
    static long Maxi(int[] arr){
        long max = Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}

