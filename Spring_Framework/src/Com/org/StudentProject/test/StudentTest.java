package Com.org.StudentProject.test;

import Com.org.StudentProject.Service.InMemoryStudentRepository;
import Com.org.StudentProject.Service.StudentManagementSystem;
import Com.org.StudentProject.Service.StudentService;

public class StudentTest {
    public static void main(String[] args) {
        // Create an instance of InMemoryStudentRepository
        StudentService studentService = new InMemoryStudentRepository();

        // Create an instance of StudentManagementSystem and pass the StudentRepository instance
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem(studentService);

        // Enroll students
        studentManagementSystem.enrollStudent("John", 20);
        studentManagementSystem.enrollStudent("Alice", 22);

        // Display all students
        studentManagementSystem.displayAllStudents();

        // Remove a student
        studentManagementSystem.removeStudent("John");

        // Display all students after removal
        studentManagementSystem.displayAllStudents();
    }
}
