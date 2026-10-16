import java.io.*;

public class SimpleLogger {
    static String createLog(int i) {
        return "[INFO] Test mesaji nomre " + i + "\n";
    }

    public static void WritePlain(int count) {
        try {
            FileOutputStream outputStream = new FileOutputStream("logs_plain.txt");
            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                outputStream.write(log.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBuffered(int count) {
        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("logs_buffered.txt"))) {

            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                output.write(log.getBytes());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }

