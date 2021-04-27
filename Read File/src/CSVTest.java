import java.io.*;
import java.util.ArrayList;

public class CSVTest {
    public static void main(String[] args) {
        String path = "testCsv.csv";
        File file = new File(path);
        try {
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                file.createNewFile();
            }
            ArrayList<Country> countries = new ArrayList<>();
            countries.add(new Country("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"));
            countries.add(new Country("1.0.1.0","1.0.3.255","16777472","16778239","CN","China"));
            countries.add(new Country("1.0.4.0","1.0.7.255","16778240","16779263","AU","Australia"));
            countries.add(new Country("1.0.8.0","1.0.15.255","16779264","16781311","CN","China"));
            countries.add(new Country("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan"));
            countries.add(new Country("1.0.32.0","1.0.63.255","16785408","16793599","CN","China"));
            countries.add(new Country("1.0.64.0","1.0.127.255","16793600","16809983","JP","Japan"));
            countries.add(new Country("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand"));
            CSVWriter(path,countries);
            System.out.println(CSVReader(path).toString());


        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static void CSVWriter(String path, ArrayList<Country> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        StringBuilder line = new StringBuilder();
        for (Country country : list) {
            line.append(country.toString());
        }
        bw.write(line.toString());
        bw.close();
    }

    public static ArrayList<Country> CSVReader (String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        ArrayList<Country> result = new ArrayList<>();
        String check;
        while ((check = br.readLine()) != null){
            String[] str = check.split(",");
            result.add(new Country(str[0],str[1],str[2],str[3],str[4],str[5]));
        }
        br.close();
        return result;
    }
}
