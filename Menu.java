import java.util.*;

public class Menu
{
    static Scanner scannerObj = new Scanner(System.in);
    public static void main(String[] args) 
    {
        printMenu();

        String userInput = getInput();

        validateInput(userInput);

    }// end main

    public static void printMenu()
    {
        System.out.println("+------------------------------+");
        System.out.println("          GREAT STORE           ");
        System.out.println("          BY OREOLUWA           ");
        System.out.println("+------------------------------+");
        System.out.println(" D - Display Inventory");
        System.out.println(" O - Make an Order");
        System.out.println(" L - List all Orders made");
        System.out.println(" X - Exit");
        System.out.println("+------------------------------+");
        System.out.print("Enter an option: ");

    }// end printMenu()

        

    public static String getInput()
    {
        String userOption = scannerObj.next();

        String correctUserOption = userOption.trim().toUpperCase();

        return correctUserOption;
    }// end getInput();
        


    public static void validateInput(String correctUserOption)
    {
        String[] acceptableOptions = {"D", "O", "L", "X"};
        Set<String> options = new HashSet<String>(Arrays.asList(acceptableOptions));

        while(!options.contains(correctUserOption))
        {
            System.out.println("");
            System.out.println("Invalid option. Enter D, O, L or X");
            printMenu();
            System.out.print("Enter an option: ");
            
            correctUserOption = getInput();

        }// end validateInput()
    }
    

}//end Menu class