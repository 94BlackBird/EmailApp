import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
            System.out.println("ENTER YOUR FIRSTNAME: ");
            String firstName = in.nextLine();
            System.out.println("ENTER YOUR LASTNAME: ");
            String lastName = in.nextLine();
            Email em1 = new Email(firstName,lastName);
        in.close();
            System.out.println(em1.showInfo());
    }
}
