import helpers.ConsoleColours;
import helpers.InputReader;

public class App 

{
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_PURPLE);
        System.out.println(ConsoleColours.ANSI_BG_BLACK);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        String name = "Zepper";
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Fudail Khan");
        System.out.println();
        System.out.println("Task 1");
        System.out.println("Hello world");
        System.out.println();
        System.out.println("Task 2");
        System.out.println("Hello " + name);
        System.out.println();
        System.out.println("Task 3");
        int length = 0;
        int height = 0;
        System.out.println("Enter the length of the rectange");
        //length = InputReader.getInt(length);
        System.out.println("Enter the height of the rectangele");
        //height = InputReader.getIn(height);
        System.out.println("Area = " + (length * height));
        

    }
}
