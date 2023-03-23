import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
    public static void main(String[] args) throws IOException {
        String filename = "in.java";
        Path path = new File(filename).toPath();
        String mimeType = Files.probeContentType(path);
        System.out.println(mimeType);
    }
}
