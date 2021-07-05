package utils;

import services.SneakerService;
import services.WhiskeyService;

import java.io.IOException;

public class JSONUtils {
    public static void writeFiles() throws IOException {
        SneakerService.writeJSON();
        WhiskeyService.writeJSON();
    }

    public static void readFiles() throws IOException {
        SneakerService.readJSON();
        WhiskeyService.readJSON();
    }
}
