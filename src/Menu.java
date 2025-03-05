import java.util.Scanner;

public class Menu {
    public static final Scanner reader = new Scanner(System.in);
    public boolean isClosed = false;

    public Menu() {
        while (!isClosed) {
            System.out.println("0. Close Menu");

            int Input = reader.nextInt();

            if (Input == 0) {
                isClosed = false;
            }
        }
    }
}