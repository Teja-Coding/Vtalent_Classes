package Com.org.StudentProject.Service;

import java.util.ArrayList;
import java.util.List;

import Com.org.StudentProject.StudentClass;

public class InMemoryStudentRepository implements StudentService{
	 private List<StudentClass> students;

	    public InMemoryStudentRepository() {
	        students = new ArrayList<>();
	    }

	    public void addStudent(StudentClass student) {
	        students.add(student);
	    }

	    public void removeStudent(StudentClass student) {
	        students.remove(student);
	    }

	    public List<StudentClass> getAllStudents() {
	        return students;
	    }
	
	
}
