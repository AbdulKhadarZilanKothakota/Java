 import java.util.Scanner;

// class Main{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter number : ");
//         int num = scan.nextInt();

//         if((num-7)%10==0){
//             System.out.println("Last digit is Seven");
//         }
//         else{
//             System.out.println("Last digit is not a Seven");
//         }
//     }
// }


class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=scan.nextInt();

        if(num%10==7){
            System.out.println("seven");
        }
        else{
            System.out.println("not");
        }
    }

}