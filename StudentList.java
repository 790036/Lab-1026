
/**
 * Write a description of class StudentList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentList
{
    Student students[] = new Student[4];
    public void StudentList(){
        
    }
    public void addStudent(Student s, int i){
        students[i] = s;
    }
    public Student getStudent(int v){
        return students[v];
    }
}
