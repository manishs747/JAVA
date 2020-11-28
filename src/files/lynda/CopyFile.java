package files.lynda;

import java.io.*;

public class CopyFile {


    public static void main(String[] args) {

        String source = "src/files/lynda/source.txt";
        String target = "src/files/lynda/target.txt";
        copyFile(source, target);
    }

    public static void copyFile(String source, String target) {
        try (
                FileReader fileReader = new FileReader(source);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(target);
        ) {

            while (true) {
                String line = bufferedReader.readLine();
                if (null == line) {
                    break;
                }
                fileWriter.write(line + "\n");
            }
            System.out.println("File Copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
