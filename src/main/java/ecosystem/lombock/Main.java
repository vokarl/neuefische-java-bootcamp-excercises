package ecosystem.lombock;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Student student1 = new Student(32, "Bob", "Bornholmer Str. 54", 12);
        Student student2 = new Student(2, "Tim", "Mainzer Str. 19", 10);


        Teacher teacher = new Teacher(1, "Mr. Smith", "Math");

        Course course = new Course(1, "Math 101", teacher, Arrays.asList(student1, student2));


        System.out.println(course);

        System.out.println("Teacher Name: " + course.getTeacher().name());
        System.out.println("Student Names: ");
        for (Student student : course.getStudents()) {
            System.out.println(student.getName());

    }
}
}


