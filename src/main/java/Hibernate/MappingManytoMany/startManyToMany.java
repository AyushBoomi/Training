package Hibernate.MappingManytoMany;

import Hibernate.MappingOneToMany.OneToManyEmployee;
import Hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Access;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class startManyToMany {

    public static void main(String[] args){

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ManyToManyEmployee employee1 =new ManyToManyEmployee("ayush@gmail.com","Ayush","Parihar");
//        ManyToManyEmployee employee2 =new ManyToManyEmployee("ayush1@gmail.com","Ayush1","Parihar1");

        ManyToManyAccount account1=new ManyToManyAccount();
        ManyToManyAccount account2=new ManyToManyAccount();

        account1.setAccountNumber("2443-444-4444");
        account2.setAccountNumber("2454-422-1111");

        Set<ManyToManyAccount> accounts =  new HashSet<>();
        employee1.setAccount(accounts);

        Set<ManyToManyEmployee> employees =  new HashSet<>();

        employees.add(employee1);

        account1.setEmployee(employees);
        account2.setEmployee(employees);


        session.save(employee1);

        session.close();


    }
}
