import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CGPA : ");
        float n = scan.nextFloat();
        float[] s = new float[5];
        for(int i=0;i<5;i++){
            s[i] = n;
        }
        System.out.print("The CGPA's are : ");
        for(int i=0;i<5;i++){
            System.out.print(s[i]);
        }
    }

}