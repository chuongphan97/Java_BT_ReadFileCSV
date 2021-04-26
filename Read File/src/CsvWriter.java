import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvWriter {
    public static void main(String[] args) throws IOException {
        List<List<String>> rows = Arrays.asList(
            Arrays.asList("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"),
            Arrays.asList("1.0.1.0","1.0.3.255","16777472","16778239","CN","China"),
            Arrays.asList("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia"),
            Arrays.asList("1.0.8.0","1.0.15.255","16779264","16781311","CN","China"),
            Arrays.asList("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan"),
            Arrays.asList("1.0.32.0","1.0.63.255","16785408","16793599","CN","China"),
            Arrays.asList("1.0.64.0","1.0.127.255","16793600","16809983","JP","Japan"),
            Arrays.asList("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand")
        );

        FileWriter writer = new FileWriter("test.csv");
        for (int i = 0; i < rows.size(); i++) {
            writer.append(String.join(",", rows.get(i)));
            writer.append("\n");
        }

        writer.flush();
        writer.close();
    }
}
