import java.util.*;
public class StudentListRunner
{
   public static void main(String[] args){
       Scanner scr = new Scanner(System.in);
       //int v = scr.nextInt();
       StudentList studList = new StudentList();
       Student s1 = new Student(999999, 1.5, "Joe");//bryce lang copied my dode
       studList.addStudent(s1, 0);
       Student s2 = new Student(999998, 2.1, "Steve");
       studList.addStudent(s2, 1);
       Student s3 = new Student(999997, 0.9, "Dave");
       studList.addStudent(s3, 2);
       int x = 1;
       while(x==1){
           System.out.println("Enter 1 to add a student and 2 to print a list of students::");
           int response = scr.nextInt();
           if(response == 1){
               System.out.println("What is the student's name?::");
               String newName = scr.next();
               System.out.println("What is the student's ID?::");
               int newID = scr.nextInt();
               System.out.println("What is the student's GPA?::");
               int newGPA = scr.nextInt();
               Student s4 = new Student(newID, newGPA, newName);
               studList.addStudent(s4, 3);
            }//oliver copied my code
           else if(response == 2){
               System.out.println("Student list::");
            }
           else{
               System.out.println("Please enter a valid input");
            }
        }
       //Student a1 = studList.getStudent(1);
       //System.out.println(a1.getName());
    }
}
