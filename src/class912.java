import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class class912 {
    public static void main(String[] args) throws IOException{
        var filename = "students.txt";
        var studentFile = Paths.get(filename);
        var allStudents = Files.readString(studentFile);
        String [] separatedNames = allStudents.split("\n");
        //nowlets show user
        System.out.println("Here are the students in your class;");
        for (var studentName: separatedNames){

            System.out.println(studentName);

        }
    }

}
