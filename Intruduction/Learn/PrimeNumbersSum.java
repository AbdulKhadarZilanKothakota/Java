import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a numnber upto : ");
        int num=scan.nextInt();
        int sum=0;
        for(int j=2;j<=num;j++){
            int count=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
                
            }
            if(count==2){
                    System.out.println(j+" ");
                    sum +=j;
                }
        }
        System.out.println("sum of prime numbers : "+sum);
    }
}