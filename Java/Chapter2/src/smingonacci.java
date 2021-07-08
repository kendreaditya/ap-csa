import java.util.Scanner;
public class smingonacci
{
    public static void main(String[] args) 
    {
        int n, a = 1, b = 1, c = 0;
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= 100; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}