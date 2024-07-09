package oop.list;

import java.util.ArrayList;
import java.util.List;




public class School {
    public static void main(String[] args) {
        School school = new School();


        school.addStudent(new Student("John", "Doe", 1));
        school.addStudent(new Student("Jane", "Smith", 2));
        school.addStudent(new Student("Michael", "Johnson", 3));


        school.printAllStudents();

        Student foundStudent = school.findById(2);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent);
        }else{
            System.out.println("Student not found");
        }

        Student removedStudent = school.removeStudent(2);
        if (removedStudent != null) {
            System.out.println("Removed student: " + removedStudent);
        }else{
            System.out.println("Student not found");
        }



    }

    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId){
                return student;
            }
        }
        return null;
    }
    public Student removeStudent(int studentId){
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                return student;
            }
        }
        return null;
    }


}
