import java.util.Scanner;

//1110
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthArray = scanner.nextInt();

        if (lengthArray <= 0) {
            return;
        }

        lengthArray--;
        String currentNum = scanner.nextLine();
        System.out.println(currentNum);

        for ( ;lengthArray != 0; lengthArray--) {
            String temp = scanner.nextLine();
            if(temp != currentNum) {
                currentNum = temp;
                System.out.println(currentNum);

            }
        }
    }
}
