import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class TeamStats {

    public static void main(String[] args) throws IOException {
        // reads csv file and parses data
        List<Map<String, String>> teamStats = readCSV("team_stats_2003_2023.csv");
    }

    // method to read csv file and return data as a list of maps
    // each row in the file is a map
    public static List<Map<String, String>> readCSV(String filename) throws IOException {

        List<Map<String, String>> records = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filename));

        // split the header line with a comma
        String[] headers = lines.get(0).split(",");

        // process each line as a map with column name
        records = lines.stream()
                .skip(1) // skip the header row
                .map(line -> line.split(",")) // split each line by comma
                .map(values -> {
                    Map<String, String> record = new HashMap<>();
                    for (int i = 0; i < headers.length; i++) {
                        record.put(headers[i], values[i]);
                    }
                    return record;
                })
                .collect(Collectors.toList());

        return records;

    }
}
