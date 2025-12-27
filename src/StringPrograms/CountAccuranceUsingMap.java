package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountAccuranceUsingMap {
    static void main(String[] args) {


        String s = "wassimm";
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (map.containsKey(c)){
                int count=map.get(c);
                count++;
                map.put(c,count);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);


    }
}