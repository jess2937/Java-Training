import java.util.Arrays;
public class arrayOpr
{
    public static void main(String[] args)
    {
        int[] a = {10,11,12,13,14,15,16,17,18,19,20};
        int lt = 0;
        int rt = a.length-1;

        while(lt<rt)
        {
        lt++;
        rt--;
        System.out.println((a[lt]+a[rt]));
        }

        if(lt==rt)
        {
            System.out.println(a[lt]);
        }
    }

}
