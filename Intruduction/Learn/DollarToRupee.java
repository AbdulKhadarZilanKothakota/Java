import java.util.Scanner;

class DollarToRupee{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Dollars : ");
        float dollars = scan.nextFloat();

        float rupees = dollars*82.04f;
        System.out.println("Rupees : "+rupees);
    }
}