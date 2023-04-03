package main.java.Internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {
    public static void main(String[] args) {
        String lang="ge";
        String country="GE";

        Locale l = new Locale(lang,country);
        ResourceBundle r = java.util.ResourceBundle.getBundle("Internationalization/Bundle", l);

        String w =r.getString("wish");
        System.out.print(w);
    }
}
