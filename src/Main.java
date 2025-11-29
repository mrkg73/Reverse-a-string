import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter your string");
        String nam= sc.nextLine();
        sc.close();

       for(int i=nam.length()-1;i>=0;i--)  System.out.print(nam.charAt(i));


    }
}
