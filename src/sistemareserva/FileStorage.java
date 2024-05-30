package sistemareserva;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public class FileStorage {

    public static <T> void writeFile(List<T> data, String fileName) throws IOException {
        try (FileWriter fileWriter = new FileWriter("./storage/" + fileName + ".txt")) {
            for (T item : data) {
                String json = new Gson().toJson(item);
                fileWriter.write(json + System.lineSeparator());
            }
        }
    }

    public static <T> List<T> readFileInList(Class<T> type, String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("./storage/" + fileName + ".txt"), StandardCharsets.UTF_8);
            return lines.stream().map(it -> new Gson().fromJson(it, type)).collect(Collectors.toList());
        } catch(IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        } 
    }

}
