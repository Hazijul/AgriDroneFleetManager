import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class TelemetryLogger {
    private static final String FILE_NAME = "mission_logs.txt";

    public static void logMission(String details) {
        // Try-with-resources automatically closes the file writer
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write("[" + LocalDateTime.now() + "] " + details + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to telemetry log: " + e.getMessage());
        }
    }
}