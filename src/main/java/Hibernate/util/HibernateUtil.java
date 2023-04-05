package Hibernate.util;

import Hibernate.model.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.imageio.spi.ServiceRegistry;
import java.util.Properties;
import java.util.ServiceConfigurationError;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            try{
                Configuration configuration=new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate_db?useSSL=false");
                settings.put(Environment.USER,"root");
                settings.put(Environment.PASS,"Ayush@1703");
                settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.SHOW_SQL,"true");
                settings.put(Environment.HBM2DDL_AUTO,"create-drop");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Student.class);
//                sessionFactory = new Configuration().configure().buildSessionFactory();
                StandardServiceRegistry serviceRegistry= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            }catch (Exception e){
                e.printStackTrace();

            }


        }
        return sessionFactory;

    }
}
