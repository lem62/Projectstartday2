import java.util.ArrayList;
import java.util.Scanner;
public class example3 {
    public static void main(String[]args) {
    // type code below
        var studentsNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while (!userResponse.equals("done")){
            System.out.print("Type in the next student name or 'done' to exit:");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                break;
            }
            studentsNames.add(userResponse);
        }
    }
}
