import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Menu {
    public static final Scanner reader = new Scanner(System.in);
    public boolean isClosed = false;

    public Menu(List<String> options) {
        while (!isClosed) {
            for (int x = 1; x < options.size(); x++) {
                System.out.println(x + ". " + options.get(x-1));
            }

            System.out.println("0. Close Menu");

            int Input = reader.nextInt();

            if (Input == 0) {
                isClosed = false;
            } else { }
        }
    }
}