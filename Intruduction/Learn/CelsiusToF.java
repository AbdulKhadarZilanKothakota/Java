import java.util.Scanner;

class CelsiusToF{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Celsius : ");

        // F= (9.0f/5 * c)+32
        // C= 5.0f/9 - (f-32)

        int c = scan.nextInt();
    

        float f = (c*9.0f/5) + 32;

        float cel = 5.0f/9 * (f-32);

        System.out.println("Fahrenheit : "+f);
        System.out.printf("Celsius : %.1f%n",cel);
    }
}