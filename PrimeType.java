public class PrimeType
{
    public static void main(String[] args)
    {
        int d;
        int n;
        int count;
        int total = 0;

        for(int i = 250; i <= 750; i++)
        {
            n = i;
            count = 0;

            while(n != 0)
            {
                d = n % 10;

                if(d == 2 || d == 3 || d == 5 || d == 7)
                {
                    count++;
                }

                n = n / 10;
            }

            if(count == 2)
            {
                System.out.println(i);
                total++;
            }
        }

        System.out.println("Total count = " + total);
    }
}