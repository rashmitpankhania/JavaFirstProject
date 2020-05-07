import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDirectory {
    public static void main(String[] args) throws IOException {
        Files.list(Path.of(".")).forEach(System.out::println);
    }
}
