package ie.nuigalway.macaoidh.StudentEnrollment;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Student {
	
	String Name;
	int Age;
	LocalDate DOB;
	int ID;
	String Username;
	CourseProgramme Course;
	ArrayList <Module> Modules = new ArrayList<Module>();
	
	public Student(String name, int age, LocalDate dob, int id, CourseProgramme course){
        this.Name = name;
        this.Age = age;
        this.DOB = dob;
        this.ID = id;
        this.Course = course;
        setUsername();
    }
    
    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dob) {
		DOB = dob;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public CourseProgramme getCourse() {
		return Course;
	}

	public void setCourse(CourseProgramme c) {
		Course = c;
	}

	public ArrayList<Module> getModules() {
		return Modules;
	}

	public void setModules(Module mod) {
		Modules.add(mod);
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername() {
		Username = Name + Integer.toString(Age);
	}
	
	 @Override public String toString(){
	        String courseSave = getCourse().getName();
	        String modulesSave = new String();
	        for(int i=0; i<getModules().size(); i++){
	                    modulesSave += getModules().get(i).getName() + ", ";
	        }
	        return "Student: " + this.Name + "\tID: " + Integer.toString(ID) +
	                "\nCourse: " +  courseSave +
	                "\nModules: " + modulesSave;
	    }
}
