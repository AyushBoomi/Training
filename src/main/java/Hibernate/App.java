package Hibernate;


import Hibernate.dao.StudentDao;
import Hibernate.model.Student;

public class App {

    public static void main(){
        StudentDao studentDao=new StudentDao();
        Student student = new Student("Ayush","Prihar","ayush@gmail.com");

    }

}
