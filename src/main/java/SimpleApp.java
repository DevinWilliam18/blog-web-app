import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SimpleApp{
	public static void main(String[] args) {
        try {
            // Load hibernate.cfg.xml
            SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            System.out.println("Hibernate SessionFactory created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }		
	}
}