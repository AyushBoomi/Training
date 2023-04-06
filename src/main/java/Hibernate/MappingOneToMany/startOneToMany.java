package Hibernate.MappingOneToMany;



import Hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class startOneToMany {

    public static void main(String[] args){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        OneToManyAccount account1=new OneToManyAccount();
        account1.setAccountNumber("1235-3455-5675");

        OneToManyAccount account2=new OneToManyAccount();
        account2.setAccountNumber("1235-3455-5623");

        OneToManyAccount account3=new OneToManyAccount();
        account3.setAccountNumber("1235-3455-5672");

        Set<OneToManyAccount> accounts=new HashSet<>();

        accounts.add(account1);accounts.add(account2);accounts.add(account3);

        OneToManyEmployee oneToManyEmployee =new OneToManyEmployee("ayush@gmail.com","Ayush","Parihar");

        session.saveOrUpdate(account1);
        session.saveOrUpdate(account2);
        session.saveOrUpdate(account3);

        oneToManyEmployee.setAccount(accounts);
        session.save(oneToManyEmployee);

        session.getTransaction().commit();

        session.close();

    }
}
