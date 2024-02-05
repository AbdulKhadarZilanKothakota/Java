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

        
        long res = Abdul.product(arr);
        System.out.println(res);
    }
}


class Abdul{
    static long product(int[] arr){
        long mul=1;
        for(int i=0;i<arr.length;i++){
            mul=mul*arr[i];
        }
        return mul;
    }
}

