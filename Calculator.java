import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner asd = new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER : ");
        Double x = (double) asd.nextInt();
        System.out.println("ENTER 2ND NUMBER : ");
        double y = (double) asd.nextInt();
        double add = x + y ;
        double sub = x - y ;
        double mul = x * y ;
        double div = x / y ;
        System.out.println("ADDITION = " + add);
        System.out.println("SUBTRACTION = " + sub);
        System.out.println("MULTIPLICATION = " + mul);
        System.out.println("DIVISION = " + div);

    }

}
