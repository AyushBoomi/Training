package Threads;

// Java Program to illustrate methods
// of ConcurrentMap interface
import java.util.concurrent.*;

class ConcurrentMapDemo {

    public static void main(String[] args)
    {
        // Since ConcurrentMap is an interface,
        // we create instance using ConcurrentHashMap
        ConcurrentMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
        m.put(100, "Geeks");
        m.put(101, "For");
        m.put(102, "Geeks");

        // Here we cant add Hello because 101 key
        // is already present
        m.putIfAbsent(101, "Hello");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "For");

        // Now we can add Hello
        m.putIfAbsent(101, "Hello");

        // We can replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println("Map contents : " + m);
    }
}

