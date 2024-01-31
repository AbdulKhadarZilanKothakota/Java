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
        System.out.print("Enter Fourth Number : ");
        int num4 = scan.nextInt();

        int max1,max2,max;
        if(num1>=num2){
            max1=num1;
            //System.out.println(max1);
            if(num3>=num4){
                max2=num3;
                //System.out.println(max2);

                if(max2>max1){
                    max=max2;
                    System.out.println(max);
                }
                else{
                    max=max1;
                    System.out.println(max);
                }
            }
            else{
                max2=num4;
                //System.out.println(max2);
                if(max2>max1){
                    max=max2;
                    System.out.println(max);
                }
                else{
                    max=max1;
                    System.out.println(max);
                }
            }
        }
        else{
            max1=num2;
            //System.out.println(max1);

            if(num3>=num4){
                max2=num3;
                //System.out.println(max2);

                if(max2>max1){
                    max=max2;
                    System.out.println(max);
                }
                else{
                    max=max1;
                    System.out.println(max);
                }
            }
            else{
                max2=num4;
                //System.out.println(max2);
                if(max2>max1){
                    max=max2;
                    System.out.println(max);
                }
                else{
                    max=max1;
                    System.out.println(max);
                }
            }
        }
    }
}