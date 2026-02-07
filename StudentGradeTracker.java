/*For this small project (student grade tracker), read how many students are there, then get the names and grades. Store the input. 
If a student attains a 50 or above, state their name and by how much they have passed. Else, declare their name and by how much they have failed. */

import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students are there? ");
        
        int n = scan.nextInt();

        scan.nextLine();

        HashMap <String, Integer> students = new HashMap<>();
        for(int i = 0; i < n;  i++){
            System.out.println("Enter name: ");
            String name = scan.nextLine();

            System.out.println("Enter grade: ");
            int grade = scan.nextInt();
            scan.nextLine();

            students.put(name, grade);

        }

        scan.close();

        for(String name: students.keySet()){
            int grade = students.get(name);
            printPassFail(name, grade);
        }

    }

    public static void printPassFail(String name, int grade){
        if (grade >= 50) {
            System.out.println(name + "passed with " + grade);
            
        }else{
            System.out.println(name + "passed with "+ grade);
        }
    }



    }
