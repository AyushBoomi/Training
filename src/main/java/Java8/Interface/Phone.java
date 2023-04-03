package main.java.Java8.Interface;

public interface Phone {

    void call();
    default void message(){
        System.out.println("sent");
    }
}
