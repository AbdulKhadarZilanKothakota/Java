import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=scan.nextInt();
        
        if(num%100==37){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}