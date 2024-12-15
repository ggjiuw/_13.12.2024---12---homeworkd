import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 animals");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        writeAnimalArray(array);
    }

    public static void writeAnimalArray(String[] array) throws IOException {
        try {
            PrintWriter writer = new PrintWriter("animals.txt", "UTF-8");
            for (String animal : array) {
                writer.println(animal);
            }
            writer.close();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}