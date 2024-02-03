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

        
        long res = Abdul.Mini(arr);
        System.out.println(res);
    }
}


class Abdul{
    static long Mini(int[] arr){
        long min = Long.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}

