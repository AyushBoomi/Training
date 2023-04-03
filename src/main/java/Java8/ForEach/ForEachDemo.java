package main.java.Java8.ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(3,4,5,6,7);
        values.forEach(System.out::println);

    }
}
