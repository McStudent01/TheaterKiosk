import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.println("What is your current age: ");
        age = in.nextInt();

        if (age >= 21)
        {
            System.out.println("You are over 21. You get a wristband. Please drink responsibly.");
        }
    }
}