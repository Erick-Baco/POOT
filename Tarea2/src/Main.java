import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String data = null;

        data= sc.nextLine();
        String parts[] = data.split(" ");

        String name = parts[0];
        String profesion = parts [1];
        String country = parts [2];

        System.out.println("Nombre: " + name.toUpperCase());
        System.out.println("Profesión: " + profesion.toUpperCase());
        System.out.println("País: " + country.toUpperCase());

    }
}