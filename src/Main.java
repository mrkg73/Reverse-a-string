import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter your string");
        String nam= sc.nextLine();
        sc.close();

        char[] chr= nam.toCharArray();
        int size=nam.length(), count =size-1;
        char[] reversedString= new char[size];


       for(int i=0;i<size;i++)
        {
            reversedString [i] =chr[count];
            count-=1;
        }
        System.out.print("Revered string is: " + new String(reversedString));
    }
}
