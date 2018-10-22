package ie.nuigalway.macaoidh.StudentEnrollment;

import org.joda.time.LocalDate;
import java.util.ArrayList;
import junit.framework.TestCase;


public class ModuleTest extends TestCase {
    
    public ModuleTest(String testName) {
        super(testName);
    }

    public void testGetName() {
        Module instance = new Module("Software Engineering III", 417);
        String expResult = "Software Engineering III";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    public void testSetName() {
        String name = "changeNameTest";
        Module instance = new Module("Software Engineering III", 417);
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    public void testGetId() {
        Module instance = new Module("Software Engineering III", 417);
        int expResult = 417;
        int result = instance.getID();
        assertEquals(expResult, result);
    }

    public void testSetId() {
        int id = 714;
        Module instance = new Module("Software Engineering III", 417);
        instance.setID(id);
        assertEquals(id, instance.getID());
    }

    public void testAddStudent() {
        Student s = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 417, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        Module instance = new Module("Software Engineering III", 417);
        instance.setStudents(s);
        assertEquals(s, instance.getStudents().get(0));
    }

    public void testGetStudents() {
        Module instance = new Module("Software Engineering III", 417);
        ArrayList<Student> expResult = new ArrayList<Student>();
        expResult.add(new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30"))));
        expResult.add(new Student("MaryKate Morhan", 19, LocalDate.parse("1997-4-17"), 262, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30"))));
        expResult.add(new Student("Carmel Botter", 20, LocalDate.parse("1994-2-15"), 263, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30"))));
        
        instance.setStudents(expResult.get(0));
        instance.setStudents(expResult.get(1));
        instance.setStudents(expResult.get(2));
        
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    public void testAddCourse() {
        CourseProgramme c = new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30"));
        Module instance = new Module("Software Engineering III", 417);
        instance.setCourses(c);
        assertEquals(c, instance.getCourses().get(0));
    }

    public void testGetCourses() {
        Module instance = new Module("Software Engineering III", 417);
        ArrayList<CourseProgramme> expResult = new ArrayList<CourseProgramme>();
        expResult.add(new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        expResult.add(new CourseProgramme("Classics", LocalDate.parse("2017-8-30"), LocalDate.parse("2018-6-4")));
        expResult.add(new CourseProgramme("Engineering", LocalDate.parse("2016-9-6"), LocalDate.parse("2017-5-25")));
        
        instance.setCourses(expResult.get(0));
        instance.setCourses(expResult.get(1));
        instance.setCourses(expResult.get(2));
        
        ArrayList<CourseProgramme> result = instance.getCourses();
        assertEquals(expResult, result);
    }
    
}