import java.util.Scanner;
public class nonRepeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //String a = "Jesinda Rachel";
        int count=0;

        for(int i=0; i<a.length(); i++)
        {
            count=0;
            for (int j=0; j<a.length(); j++)
            {
                if (a.charAt(i)==a.charAt(j))
                {
                    count++;
            
                }
            }
            if(count==1)
            {
                System.out.println(a.charAt(i));
                break;
            }
        }
        
    }
}