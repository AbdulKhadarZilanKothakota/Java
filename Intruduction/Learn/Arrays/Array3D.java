import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        
        int[][][] a=new int[2][2][5];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<5;k++){
                    a[i][j][k]=scan.nextInt();
                }  
            }
        }
        System.out.println("The Ages are : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<5;k++){
                    System.out.print(a[i][j][k]+" ");
                }  
                System.out.println();
            }
        }
    }
}