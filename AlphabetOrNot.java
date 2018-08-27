import java.io.*;
import java.util.Scanner;
public class AlphabetOrNot
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print( "Alphabet");
        }
        else
        {
            System.out.print("No");
        }
    }
}
