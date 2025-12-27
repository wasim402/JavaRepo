package MediumPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNum {
    static void main(String[] args) {


    int [] nums = {1,9,9,2,3,4,2,3,6,7,-2};
// insertion order maintain lin LinkedHashSet
    Set<Integer> Lset = new LinkedHashSet<>();
    Set<Integer> Tset = new TreeSet<>();
    Set<Integer> Hset = new HashSet<>();

      for (int num: nums){
          Lset.add(num);
          Tset.add(num);
          Hset.add(num);
    }
//      order in LinkedHashSet
        System.out.print("LinkedHashSet : ");
        System.out.println(Lset);
//        Sorting in Treeset
        System.out.print("TreeSet : ");
        System.out.println(Tset);
//        Only Faster , No order and No sorting
        System.out.print("HashSet : ");
        System.out.println(Hset);

    }
}