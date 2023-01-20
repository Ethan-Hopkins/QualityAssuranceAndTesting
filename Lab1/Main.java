import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String OutputFile = "StudentRoster.txt";
        CreateFile(OutputFile);
        Scanner input = new Scanner(System.in);
        boolean addAnother = true;
        while(addAnother){
            System.out.print("Enter Student's full name:\t");
            String Name = input.nextLine();
            System.out.println();

            System.out.print("Enter Student's numerical 9 digit TUID:\t");
            String TUID = input.nextLine();
            System.out.println();

            System.out.print("Enter Student's Email Address:\t");
            String Email = input.nextLine();
            System.out.println();

            System.out.print("Enter Student's phone number:\t");
            String phoneNum = input.nextLine();
            System.out.println();

            System.out.print("Enter Student's Major:\t");
            String Major = input.nextLine();
            System.out.println();

            System.out.print("Enter Student's Graduation Date (format is MM-DD-YYYY):\t");
            String gradDate = input.nextLine();
            System.out.println();

            System.out.print("Is student UnderGraduate (enter yes or no):\t");
            String undergrad = input.nextLine();
            boolean isUndergrad;
            isUndergrad = undergrad.equalsIgnoreCase("yes");
            System.out.println();

            Student tempStudent = new Student(Name, Email, Major, TUID, phoneNum, gradDate, isUndergrad);
            WriteToFile(OutputFile, tempStudent.toString());
            System.out.print("Enter another Student?(enter yes or no):\t");

            String another = input.nextLine();
            if(!another.equalsIgnoreCase("yes")){
                addAnother = false;
            }
        }

    }

    private static void CreateFile(String fileName){
        try {
            File file = new File(fileName);
            if (!file.isFile()&&file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void WriteToFile(String fileName, String content){
        try {
            FileWriter myWriter = new FileWriter(fileName,true);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e) {
            System.out.println("An IOException error occurred.");
            e.printStackTrace();
        }
    }

}
