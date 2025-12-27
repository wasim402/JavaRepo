package MediumPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    static void main(String[] args) {
        String s = "Wassimm";

//     In Set DIO not allowed Duplicate ,indexing and order not maintain, imp : only TreeSet is sorted
        Set<Character> set = new LinkedHashSet<>(); // LinkedHashSet() for maintaining the insertion order

        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c1 : set) {
            sb.append(c1);
        }
            System.out.println(sb);
    }
}
