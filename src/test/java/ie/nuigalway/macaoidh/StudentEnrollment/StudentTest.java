package ie.nuigalway.macaoidh.StudentEnrollment;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
    
    public StudentTest(String testName) {
        super(testName);
    }

    public void testGetName() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        String expResult = "Philip Mac Aoidh";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    public void testGetAge() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        int expResult = 22;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    public void testGetDob() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        LocalDate expResult = LocalDate.parse("1996-8-4");
        LocalDate result = instance.getDOB();
        assertEquals(expResult, result);
    }

    public void testGetId() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        int expResult = 261;
        int result = instance.getID();
        assertEquals(expResult, result);
    }
    
    public void testGetCourse() {
        CourseProgramme expResult = new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30"));
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        instance.setCourse(expResult);
        CourseProgramme result = instance.getCourse();
        assertEquals(expResult, result);
    }
    
    public void testSetModule() {
        Module expResult = new Module("Software Engineering III", 417);
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        instance.setModules(expResult);
        Module result = instance.getModules().get(0);
        assertEquals(expResult, result);
    }

    public void testGetModules() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
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

    public void testGetUsername() {
        Student instance = new Student("Philip Mac Aoidh", 22, LocalDate.parse("1996-8-4"), 261, new CourseProgramme("CS&IT", LocalDate.parse("2015-9-1"), LocalDate.parse("2019-5-30")));
        String expResult = "Philip Mac Aoidh22";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
}
