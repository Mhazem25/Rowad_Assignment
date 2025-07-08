import java.util.Scanner;

public class ODD_EVEN
{
    public static void main(String[] args)
    {
        Scanner asd = new Scanner (System.in);
        System.out.println("ENTER 1ST NUMBER : ");
        int x = asd.nextInt();
        System.out.println("ENTER 2ND NUMBER : ");
        int y = asd.nextInt();
        if (x % 2 == 0 )
        {
            System.out.println("1ST NUMBER IS EVEN ");
        }
        else
        {
            System.out.println("1ST NUMBER IS ODD");
        }

        if (y % 2 == 0)
        {
            System.out.println("2ND NUMBER IS EVEN");
        }
        else
        {
            System.out.println("2ND NUMBER IS ODD");
        }


    }

}
