package main.java.Java8.Interface;

public class AndroidPhone implements Phone{
    public void call(){
    System.out.println("Calling");
    }

    public static void main(String[] args) {
        Phone p=new AndroidPhone();
        p.call();
        p.message();
    }
}
