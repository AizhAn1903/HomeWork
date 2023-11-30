import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder stringBuilder =  new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }
}
