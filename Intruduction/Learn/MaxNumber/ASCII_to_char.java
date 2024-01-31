import java.util.Scanner;

class ASCII_to_char{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = scan.next();

        char ch = s.charAt(0);

        System.out.println((int)ch);
    }
}