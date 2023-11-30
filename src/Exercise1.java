
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = scanner.nextLine();
        deleteDub(string);


    }

        public static void deleteDub(String s1) {

            char[] c = s1.toCharArray();

            for (int i = 1; i < c.length; i++) {

                 if (c[i] == c[i - 1]) {
                     s1 = s1.replace(String.valueOf(c[i]),"");
                 }


            }
            System.out.println(s1 );
        }





    }
