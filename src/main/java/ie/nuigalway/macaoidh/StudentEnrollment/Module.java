package ie.nuigalway.macaoidh.StudentEnrollment;

import java.util.ArrayList;

public class Module {
	
	String Name;
	int ID;
	ArrayList<Student> Students = new ArrayList<Student>();
	ArrayList<CourseProgramme> Courses = new ArrayList<CourseProgramme>();
	
	public Module(String name, int id){
        this.Name = name;
        this.ID = id;
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public ArrayList<Student> getStudents() {
		return Students;
	}

	public void setStudents(Student student) {
		Students.add(student);
	}

	public ArrayList<CourseProgramme> getCourses() {
		return Courses;
	}

	public void setCourses(CourseProgramme course) {
		Courses.add(course);
	}

}
