class Main
{
    public static void main(String[] args)
    {
        int num=12321;
        int remainder=0,reverse=0;
        while(num!=0)
        {
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
/*
class Main {
    public static void main(String[] args) {
        String word = "level";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a palindrome word.");
        } else {
            System.out.println(word + " is not a palindrome word.");
        }
    }
}

*/
