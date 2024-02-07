import java.util.Scanner;

class Main{

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_i = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] < arr[min_i]){
                    min_i = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = temp;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println();
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}