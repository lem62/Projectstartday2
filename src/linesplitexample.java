import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class linesplitexample {
    public static void main(String[] args) throws IOException{
        var filename = "Jersey.txt";
        var studentJerseys = Paths.get(filename);
        var studentLines = Files.readAllLines(studentJerseys);


    }
}
