package main.java.Strings;

import java.util.HashMap;
import java.util.Map;

//Given a date string in the form Day Month Year, where:
//
//Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
//Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
//Year is in the range [1900, 2100].
//Convert the date string to the format YYYY-MM-DD, where:
//
//YYYY denotes the 4 digit year.
//MM denotes the 2 digit month.
//DD denotes the 2 digit day.
public class Reformat_date {

    public String reformatDate(String date) {

        String[] d=date.split("\\s+");
        StringBuilder sb=new StringBuilder(d[2]);
        sb.append("-"+getMonths(d[1])+"-");
        sb.append(d[0].length()==3?  ("0"+d[0].substring(0,1)): d[0].substring(0,2));
        return sb.toString();

    }

    public String getMonths(String s){
        Map<String,String> m=new HashMap<>();
        m.put("Jan","01");
        m.put("Feb","02");
        m.put("Mar","03");
        m.put("Apr","04");
        m.put("May","05");
        m.put("Jun","06");
        m.put("Jul","07");
        m.put("Aug","08");
        m.put("Sep","09");
        m.put("Oct","10");
        m.put("Nov","11");
        m.put("Dec","12");

        return m.get(s);

    }

    public static void main(String[] args) {

    }
}