import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolną liczbę całkowitą - zakres Integer");
        String enterNumber = scanner.nextLine();


        try {

            File file = new File("numer.txt");
            file.createNewFile();

            FileWriter myWriter = new FileWriter(file);

            if (enterNumber.length() == 2 || enterNumber.length() == 3) {
                String charW = "w";
                System.out.println(charW);
                myWriter.write(charW + " " + enterNumber);

            } else {
                String charS = "s";
                System.out.println(charS);
                myWriter.write(charS + " " + enterNumber);

            }

            myWriter.close();


        } catch (Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




    }


}
