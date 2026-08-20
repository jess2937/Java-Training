import java.util.Scanner;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int upper=0;
        int lower=0;
        int digit=0;
        int special=0;

        for(char ch : a.toCharArray())
        {
            if (Character.isUpperCase(ch))
            {
                upper++;
            }
            else if (Character.isLowerCase(ch))
            {
                lower++;
            }
            else if (Character.isDigit(ch))
            {
                digit++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+upper);
        System.out.println("Digits: "+digit);
        System.out.println("Special characters: "+special);


    }


}
