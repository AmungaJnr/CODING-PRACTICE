import java.util.*;

public class ShoppingListManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items? ");

        int num = scan.nextInt();

        scan.nextLine();

        ArrayList<String> items = new ArrayList<>();
        for(int i = 0; i < num; i++){
            System.out.println("What is the name of the item? ");
            String name = scan.nextLine();

            items.add(name);
        }

        scan.close();
        
        for(String item: items){
            checkItem(item);
        }
  
    }

    public static void checkItem(String item){
        if (item.equalsIgnoreCase("milk")) {
            System.out.println("Remember the expiry date of the milk");
        }else{
            System.out.println("Added " + item);
        }
    }
}
