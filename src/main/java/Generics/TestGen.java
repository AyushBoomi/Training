package main.java.Generics;

public class TestGen {
    public static void main(String[] args) {
        MyGen<Integer> m=new MyGen<Integer>();
        m.add(2);
        System.out.print(m.get());

    }
}
