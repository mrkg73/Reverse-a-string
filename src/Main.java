import java.util.Scanner;



public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in);
        System.out.println("Enter your string");
        String nam= sc.nextLine();
        sc.close();

         nam.chars().mapToObj(s->(char)s).toList().reversed().forEach(System.out::print);
    }
}
