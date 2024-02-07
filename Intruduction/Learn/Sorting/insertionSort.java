import java.util.Scanner;

class Main{

    static void insertionSort(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            j=i-1;
            int key = arr[i];
            while(j>=0 && arr[j]<key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
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
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}