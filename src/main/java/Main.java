import java.util.Scanner;

//1110
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthArray = scanner.nextInt();

        int currentNum = scanner.nextInt();
        System.out.println(currentNum);

        for (int i = 0; i < lengthArray - 1; i++) {
            int temp = scanner.nextInt();
            if(temp != currentNum) {
                currentNum = temp;
                System.out.println(currentNum);
            }
        }
    }
}
