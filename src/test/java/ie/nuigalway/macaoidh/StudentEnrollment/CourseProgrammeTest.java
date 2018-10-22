package ie.nuigalway.macaoidh.StudentEnrollment;

import org.joda.time.LocalDate;
import java.util.ArrayList;
import junit.framework.TestCase;

public class CourseProgrammeTest extends TestCase {
    
    public CourseProgrammeTest(String testName) {
        super(testName);
    }

    public void testGetName() {
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        String expResult = "CS&IT";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    public void testSetName() {
        String name = "";
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    public void testGetModules() {
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        ArrayList<Module> expResult = new ArrayList<Module>();
        expResult.add(new Module("Software Engineering III", 417));
        expResult.add(new Module("Artificial Intelligence", 418));
        expResult.add(new Module("Professional Skills II", 408));
        
        instance.setModules(expResult.get(0));
        instance.setModules(expResult.get(1));
        instance.setModules(expResult.get(2));
        
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
    }

    public void testAddModule() {
        Module m = new Module("Software Engineering III", 1001);
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        instance.setModules(m);
        assertEquals(m.getName(), instance.getModules().get(0).getName());
    }

    public void testAddStudent() {
        Student s = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 1001, new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30")));
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        instance.setStudents(s);
        assertEquals(s,instance.getStudents().get(0));
    }

    public void testGetStudents() {
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        ArrayList<Student> expResult = new ArrayList<Student>();
        expResult.add(new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"))));
        expResult.add(new Student("MaryKate Morhan", 19, LocalDate.parse("1997-4-17"), 262, new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"))));
        expResult.add(new Student("Carmel Botter", 20, LocalDate.parse("1994-2-15"), 263, new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"))));
        
        instance.setStudents(expResult.get(0));
        instance.setStudents(expResult.get(1));
        instance.setStudents(expResult.get(2));
        
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    public void testGetStartDate() {
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        LocalDate expResult = LocalDate.parse("2018-9-1");
        LocalDate result = instance.getStartingDate();
        assertEquals(expResult, result);
    }

    public void testGetEndDate() {
        CourseProgramme instance = new CourseProgramme("CS&IT", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
        LocalDate expResult = LocalDate.parse("2019-5-30");
        LocalDate result = instance.getEndDate();
        assertEquals(expResult, result);
    }
}