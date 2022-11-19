import java.util.Scanner;

//1110
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityElement = scanner.nextInt();

        int counter = 0;
        int resultCounter = 0;

        for (int i = 0; i <= quantityElement; i++) {
            if (scanner.nextLine().equals("1")) {
                counter++;
            } else {
                if (counter > resultCounter) {
                    resultCounter = counter;
                }
                counter = 0;
            }
        }
        if (counter > resultCounter) {
            resultCounter = counter;
        }
        System.out.println(resultCounter);
    }
}
