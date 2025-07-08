import java.util.Scanner;

public class UpperCase
{
    public static void main(String[] args)
    {
        Scanner asd = new Scanner(System.in);
        System.out.println("type something");
        String word = asd.next();
        String upper = word.toUpperCase();
        int length = word.length();
        char first = word.charAt(0);
        System.out.println("uppercase : " + upper);
        System.out.println("length : " + length );
        System.out.println("first char : " + first);


    }

}
