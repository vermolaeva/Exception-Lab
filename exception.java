import java.util.Scanner;
public class exception{
    public static void main(String[] args)
    {
        String[] names = {"Lily", "Jacob","Chris", "Michael","Lena", "Bruce", "Sam", "Aidan", "Matthew", "Carlos"};
        String integer;
        try
        {
            System.out.println("Please, enter an integer from 1 to 10 to display a name");
            Scanner input= new Scanner(System.in);
            integer = input.nextLine();
            int i = Integer.parseInt(integer);
            i = i-1;
            System.out.println(names[i]);
            input.close();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your number is out of range");
        }
    }
}