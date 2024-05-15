package hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(students.class);
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
      
    	students student1 = new students();
    	
    	student1.setId(3);
    	student1.setName("Appa");
    	student1.setAge(20);
    	student1.setMajor("Psychology");
    	
    	session.beginTransaction();
    	session.save(student1);
    	session.getTransaction().commit();
    	
    	System.out.println("Student saved... check db..");
    }
}
