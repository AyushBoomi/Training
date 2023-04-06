package Hibernate.MappingOneToOne.start;

import Hibernate.MappingOneToOne.foreignKeyAsso.OneToOneAccount;
import Hibernate.MappingOneToOne.foreignKeyAsso.OneToOneEmployee;
import Hibernate.util.HibernateUtil;
import org.hibernate.Session;

public class ForeignKeyAssociation {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        OneToOneAccount oneToOneAccount =new OneToOneAccount();
        oneToOneAccount.setAccountNumber("1235-3455-5675");

        OneToOneEmployee employee=new OneToOneEmployee("ayush@gmail.com","Ayush","Parihar");

        session.saveOrUpdate(oneToOneAccount);

        employee.setAccount(oneToOneAccount);
        session.saveOrUpdate(employee);

        session.getTransaction().commit();

        session.close();


    }
}
