package files.lynda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyPath {


    public static void main(String[] args) {
        String source = "src/files/lynda/source.txt";
        String target = "src/files/lynda/target.txt";
        copyFile("lynda", "source.txt", "target.txt");
    }

    public static void copyFile(String base, String source, String target) {
        Path sourceFile = Paths.get("src", "files", base, source);
        Path destinyFile = Paths.get("src", "files", base, target);
        try {
            Files.copy(sourceFile, destinyFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File Copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
