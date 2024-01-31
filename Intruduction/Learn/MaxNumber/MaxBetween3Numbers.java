import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();
        System.out.print("Enter Third Number : ");
        int num3 = scan.nextInt();

        // int max;
        // if(num1>=num2 && num1>=num3){
        //     max=num1;
        //     System.out.println("Maximum Number is : "+max);
        // }
        // else if(num2>=num1 && num2>=num3){
        //     max=num2;
        //     System.out.println("Maximum Number is : "+max);
        // }
        // else{
        //     max=num3;
        //     System.out.println("Maximum Number is : "+max);
        // }


         if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        }
    }
}