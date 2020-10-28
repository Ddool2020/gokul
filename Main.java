import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        String student_name;
        int student_class;
        int student_age;

        Scanner input=new Scanner(System.in);
        System.out.println("FILL THE FORM");

        System.out.print("Name:");
        student_name=input.next();

        System.out.print("Class:");
        String _class=input.next();
        student_class=Integer.parseInt(_class);

        System.out.print("Age:");
        String _age=input.next();
        student_age=Integer.parseInt(_age);

        Database database = new Database();
        database.setData(student_name,student_class,student_age);


    }
}
