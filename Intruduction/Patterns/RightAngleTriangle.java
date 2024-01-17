import java.util.Scanner;
class RightAngleTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many rows and columns : ");
        int n=scan.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}