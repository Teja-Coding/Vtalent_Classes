package Com.org.StudentProject.Service;

import java.util.List;

import Com.org.StudentProject.StudentClass;

public class StudentManagementSystem {
    private StudentService studentService;

    public StudentManagementSystem(StudentService studentService) {
        this.studentService = studentService;
    }

    public void enrollStudent(String name, int age) {
        StudentClass student = new StudentClass(name, age);
        studentService.addStudent(student);
    }

    public void removeStudent(String name) {
        List<StudentClass> students = studentService.getAllStudents();
        for (StudentClass student : students) {
            if (student.getName().equals(name)) {
                studentService.removeStudent(student);
                break;
            }
        }
    }
    public void displayAllStudents() {
        List<StudentClass> students = studentService.getAllStudents();
        for (StudentClass student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}

        
 