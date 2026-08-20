public class Prime
{
    public static void main(String[] args)
    {
        boolean f;
        int d;
        int n;
        for(int i=100; i<1000; i++)
        {
            f=true;
            n=i;

            while(n!=0)
            {
                d=n%10;
                if(d!=2 && d!=3 && d!=5 && d!=7)
                {
                    f=false;
                    break;
                }
                n=n/10;
            }
            if (f)
            {
                System.out.println(i);
            }
        }
    }
}
