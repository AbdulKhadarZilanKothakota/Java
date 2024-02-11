import java.util.Scanner;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = scan.nextLine();

        StringTokenizer st = new StringTokenizer(s," ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        // System.out.println(st.hasMoreTokens());
        

    }
}