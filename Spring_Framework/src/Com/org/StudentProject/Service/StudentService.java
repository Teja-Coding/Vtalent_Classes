package Com.org.StudentProject.Service;

import java.util.List;

import Com.org.StudentProject.StudentClass;

public interface StudentService {
	 void addStudent(StudentClass student);
	 void removeStudent(StudentClass student);
	 List<StudentClass> getAllStudents();
}
