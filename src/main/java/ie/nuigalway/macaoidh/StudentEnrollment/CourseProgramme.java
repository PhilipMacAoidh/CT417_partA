package ie.nuigalway.macaoidh.StudentEnrollment;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class CourseProgramme {
	
	String Name;
	ArrayList<Module> Modules = new ArrayList<Module>();
	ArrayList<Student> Students = new ArrayList<Student>();
	LocalDate StartingDate;
	LocalDate EndDate;
	
	public CourseProgramme(String name, LocalDate start, LocalDate end) {
		this.Name = name;
		this.StartingDate = start;
		this.EndDate = end;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Module> getModules() {
		return Modules;
	}
	public void setModules(Module module) {
		Modules.add(module);
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(Student student) {
		Students.add(student);
	}
	public LocalDate getStartingDate() {
		return StartingDate;
	}
	public void setStartingDate(LocalDate startingDate) {
		StartingDate = startingDate;
	}
	public LocalDate getEndDate() {
		return EndDate;
	}
	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}
}