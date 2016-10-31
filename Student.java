
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    int stuID;
    double stuGPA;
    String stuName;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Student(int id, double gpa, String name){
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }
    public void setName(String name){
        stuName = name;
    }
    public void setID(int id){
        stuID = id;
    }
    public void setGPA(double gpa){
        stuGPA = gpa;
    }
    public String getName(){
        return stuName;
    }
    public int getID(){
        return stuID;
    }
    public double getGPA(){
        return stuGPA;
    }
}
