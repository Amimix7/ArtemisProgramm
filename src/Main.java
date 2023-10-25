import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hallo, ..!!");


        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("wie geht es dir? (gut; schlecht)");

        String userInput = input.nextLine();  // Read user input


        if (userInput.equals( "gut")){
            System.out.println("toll");
        }else if (userInput.equals("schlecht")){
            System.out.println("aha?");
            System.out.println("wieso? (schlaf)");

            userInput = input.nextLine();
            if (userInput.equals("schlaf")){
                System.out.println("oh nein!");
            }
        }



    }
}