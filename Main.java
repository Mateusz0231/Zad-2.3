import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)    
    {
        Scanner mnoz = new Scanner (System.in);
        int x=1, y=1;
        System.out.print("Wpisz ilość wierszy ");
        x = mnoz.nextInt();
        System.out.print("Wpisz ilość kolumn ");
        y = mnoz.nextInt();

        for (int i=1; i<=x; i++) 
        {
            for (int j=1; j<=y; j++)
            {
            	int a = i*j;
                System.out.printf("%4d", a);
            }
            System.out.println();
        }
    }
}