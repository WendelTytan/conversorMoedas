package conversor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logs {
    public static void Logger(String valor, String moedaOrigem, String moedaDestino, String resultado) {
        LocalDateTime timestamp = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);

        String logEntry = "{"+"\n"
                + "\"timestamp\": \"" + formattedTimestamp + "\",\n"
                + "\"valor\": \"" + valor + "\",\n"
                + "\"moedaOrigem\": \"" + moedaOrigem + "\",\n"
                + "\"moedaDestino\": \"" + moedaDestino + "\",\n"
                + "\"resultado\": \"" + resultado + "\""
                + "\n},\n";

        try (FileWriter file = new FileWriter("logs.json", true)) {
            file.write(logEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
