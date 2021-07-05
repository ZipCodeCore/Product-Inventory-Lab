package utils;

import models.Sneaker;
import services.SneakerService;
import services.WhiskeyService;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CSVUtils {
    private static final char DEFAULT_SEPARATOR = ',';  // (1)

    // (2)
    public static void writeLine(Writer w, List<String> values) throws IOException {
        boolean first = true;

        StringBuilder sb = new StringBuilder();

        // (3)
        for (String value : values) {
            if (!first) {
                sb.append(DEFAULT_SEPARATOR);
            }
            sb.append(value);
            first = false;
        }
        sb.append("\n");

        w.append(sb.toString());  // (4)
    }

    public static void writeFiles() throws IOException {
        SneakerService.csvFileSaver();
        WhiskeyService.csvFileSaver();
    }

    public static void loadFiles(){
        SneakerService.loadData();
        WhiskeyService.loadData();
    }
}