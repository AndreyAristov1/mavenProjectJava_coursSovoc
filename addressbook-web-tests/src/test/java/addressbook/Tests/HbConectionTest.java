package addressbook.Tests;
import addressbook.model.GroupData;
import org.hibernate.boot.reqistry.StandardServiceRegistry;
import org.hibernate.boot.reqistry.StandardServiceRegistryBuilder;
import org.hibernate.boot.MetadataSources;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class HbConectionTest {
    private SessionFactory sessionFactory;
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
            e.printStackTrace();
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    @Test
    public void  testHbConnection(){

    Session session = sessionFactory.openSession();
    session.deginTransaction();
        List<GroupData> result = session.createQuery("from GroupData").list();
        for (GroupData group : result){
            System.out.println(group);
        }
        session.getTransaction().commit();
        session.close();

    }
}
