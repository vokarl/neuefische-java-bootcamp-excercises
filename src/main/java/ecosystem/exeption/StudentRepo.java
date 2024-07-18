package ecosystem.exeption;

import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student findById(String id) {
        return students.get(id);
    }
}

/*Step 1: Extend the StudentDB with a findById method with a parameter id that returns
    a Student. For the self-confident: If you want to proceed test-driven (TDD,
    test-driven development), you can also start with step 3.*/
