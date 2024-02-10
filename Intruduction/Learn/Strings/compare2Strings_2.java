import java.util.Scanner;

class Main{
    public static void main(String[] args){

        String s1 = "ABC";
        String s2 = new String ("ABC");
        if(s1==s2){
            System.out.println("References are Equal");
        }
        else{
            System.out.println("References are Not Equal");  //References are Not Equal
        }
    }
}