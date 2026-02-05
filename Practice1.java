/* Question 1: Read a single line of input from STDIN.
Print it twice, each on its own line.

Question 2: Read a name from STDIN.
Print the message.
Example: Hello, <name>!

Question 3:Read two lines of input:
    A first name
    A last name
Then print: Your full name is: <first> <last>
*/
import java.util.*;

public class Practice1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        scan.close();
        
        System.out.println(String.format("Your full name is: %s %s", firstName, lastName));
        


    }
}