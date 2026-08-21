import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        Scanner q = new Scanner(System.in);
        int[] marks = new int[5];
        String [] names = new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter marks and name of the Student "+ (i+1));

            marks[i]=q.nextInt();
            q.nextLine();
            names[i]=q.nextLine();
        }
        System.out.println("------------------------");
        int s=1;
        for(int i=0;i<5;i++)
        {
            if(marks[i] > 50)
            { 
                System.out.println(s+ ". "+ (names[i]) +" has scored "+marks[i]);
                s++;
            }
        }
    }
}