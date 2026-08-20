import java.util.Scanner;
public class Repeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //String a = "Jesinda Rachel";

        for(int i=0; i<(a.length()-1); i++)
        {
            for (int j=i+1; j<a.length(); j++)
            {
                if (a.charAt(i)==a.charAt(j))
                {
                    System.out.println(a.charAt(i));
                    return;
                }
            }
        
        }
        
    }
}