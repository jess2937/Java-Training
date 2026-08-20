public class Compression
{
    public static void main(String[] args)
    {
        String a = "aaabbccccddeff";
        String b = "";
        int c = 1;

        for(int i = 0; i < a.length(); i++)
        {
            if(i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1))
            {
                c++;
            }
            else
            {
                b = b + a.charAt(i) + c;
                c = 1;
            }
        }

        System.out.println(b);
    }
}