package addressbook.Tests;
import org.hibernate.boot.reqistry.StandardServiceRegistry;
import org.hibernate.boot.reqistry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;
import org.junit.BeforeClass;
import org.junit.Test;

public class HbConectionTest {
@BeforeClass
    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    @Test
    public void  testHbConnection(){

    }
}
