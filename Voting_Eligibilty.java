import java.util.Scanner;
public class Voting_Eligibilty
{
public static void main(String[] args)
{
    Scanner asd = new Scanner(System.in);
    System.out.println("ENTER YOUR AGE : ");
    int age = asd.nextInt();
    System.out.println("ENTER YOUR NATIONALITY : ");
    String nationality = asd.next();
    if (age >= 18 && nationality.equalsIgnoreCase ("Egyptian") )
    {
        System.out.println("YOU ARE ELIGIBLE TO VOTE");
    }
    else
    {
       System.out.println("YOU ARE NOT ELIGIBLE TO VOTE ");
    }
}
}