package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
//
//Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
//
//Return a list of integers representing the size of these parts.
public class Partition_labels {

    public List<Integer> partitionLabels(String s) {

        List<Integer> ans=new ArrayList<>();
        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length();i++)
            m.put(s.charAt(i),i);

        int start=0,last=0;
        for(int i=0;i<s.length();i++){

            last=Math.max(last,m.get(s.charAt(i)));

            if(last==i){
                ans.add(last-start+1);
                start=last+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}