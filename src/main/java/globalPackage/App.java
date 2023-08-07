package globalPackage;

import globalPackage.mini.Group;
import globalPackage.mini.Instructor;
import globalPackage.mini.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
        Group group=applicationContext.getBean("group", Group.class);
        System.out.println(group);
        Instructor instructor = applicationContext.getBean("instructor", Instructor.class);
        System.out.println(instructor);
        System.out.println(instructor.whichLanguage());

    }
}
