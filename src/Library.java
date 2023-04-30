public class Library {

    static int numberOfStudents;

    void reading(Student student){
        System.out.println(student.name+" is reading.");
        numberOfStudents++;
    }
}
