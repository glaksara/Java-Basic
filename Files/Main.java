import java.io.*;

public class Main {
    public static void main(String[] args) {
//        Write
        String content = """
                Multiple lines test
                Print two lines
                """;
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(content);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("Could not write file");
        }

//        Read
        String filePath = "test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
