class Main 
{
    public static void main(String[] args)
    {
        String str = "Kothakota Abdul kahdar zilan";
        str = str.toLowerCase();
        int count = 0;
        int cont=0;
 
        for (int i = 0; i < str.length(); i++)
        {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u')
                {
                    count++;
                }
            else
            {
                cont++;
            }
        }
        System.out.println("Total no of vowels in string are: " + count);
        System.out.println("Total no of consonants in string are: " + cont);
    }
}