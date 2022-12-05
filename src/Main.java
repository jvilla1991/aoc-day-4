import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\jvill\\IdeaProjects\\aoc-day-4\\resources\\puzzle-input");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] sections = data.split(",");
                int[] sectionA = {Integer.parseInt(sections[0]), Integer.parseInt(sections[2])};
                int[] sectionB = {Integer.parseInt(sections[0]), Integer.parseInt(sections[2])};

            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}