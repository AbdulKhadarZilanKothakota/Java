import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        
        int[][] a=new int[2][5];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=scan.nextInt(); 
            }
        }
        System.out.println("The Ages are : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){ 
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}