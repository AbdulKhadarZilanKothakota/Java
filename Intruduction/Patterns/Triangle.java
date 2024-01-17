import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=scan.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
