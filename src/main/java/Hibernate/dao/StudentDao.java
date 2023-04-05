package Hibernate.dao;

import Hibernate.model.Student;
import Hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    public void saveStudent(Student student){
    Transaction transaction=null;
    try(Session session= HibernateUtil.getSessionFactory().openSession()){
        transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }catch(Exception e){
        if(transaction!=null){
            transaction.rollback();
        }
    }
    }
}
