import java.util.Scanner;
public class Inputdata {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner (System.in);
        System.out.print("Your name: ");
        String name = input.nextLine();

        System.out.print("Your Surname: ");
        String surname = input.nextLine();

        System.out.print("Your nickbame");
        String nickname = input.nextline();

        System.out.print("Your Major");
        String major = input.nextline();

        System.out.print("Your ID");
        int id = input.nextInt();

        input.close();
        System.out.print("---------------------------------------");
        System.out.println("Your Name is " +name);
        System.out.println("Your are "+ surname);
        System.out.println("Your nickname" + nickname);
        System.out.println("Your ID " + id);
        System.out.print("Your Major " + major);
    }
}
