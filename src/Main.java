public class Main {
    public static void main(String[] args) {

        Student student = new Student("Matmusa", "abduvokhob uulu", "java", 3);
        Aspirant aspirant = new Aspirant("Manas", "abdugani uulu", "Java", 4);


        Student[] students = {student, aspirant};
        for (Student a : students
        ) {
            System.out.println(a.getScholarship());

        }

    }
}