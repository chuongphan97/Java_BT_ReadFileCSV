import java.io.*;
import java.util.*;


public class ReadFileCSV {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.csv");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] text = line.split(",");
                System.out.print("Country{ start IP: " + text[0]
                        + ", end IP: " + text[1]
                        + ", start code: " + text[2]
                        + ", end code: " + text[3]
                        + ", country code: " + text[4]
                        + ", Country: " + text[5] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
