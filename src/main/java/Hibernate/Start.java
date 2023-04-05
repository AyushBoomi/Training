package Hibernate;

import Hibernate.dao.StudentDao;
import Hibernate.model.Student;

public class Start {

    public static void main(String args[]){
        StudentDao studentDao=new StudentDao();
        Student student1=new Student("Ayush","Singh","ayushparihar1703@gmail.com");
        studentDao.saveStudent(student1);

        System.out.println(student1.getId());
    }
}
