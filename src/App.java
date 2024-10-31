import entity.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setName("Durgesh");
        student.setStudentId(123);
        student.setQualifyingExamMarks(85.12f);
        student.setResidentialStatus('H');
        student.setYearOfEngg(4);
        System.out.println(student.toString());
    }
}
