package MapCollection;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class MapCrud {

    static void main(String[] args) {

        Map<String , Integer> map1 = new HashMap<>() {{
            put("wasim",23);
            put("manish",17);
            put("Aman",25);

        }};
        System.out.println("Current londiyabaz list");
        System.out.println(map1);
        for (String key : map1.keySet()) {
            int getAge = map1.get(key);

            if (getAge<18){
                System.out.println("Beta tumse na ho paega " + key);
                map1.remove(key);
            }
            else {
                System.out.println("Tera to ab kada hone laga hoga "+ key);
            }

        }
        System.out.println("latest londiyabaz list");
        System.out.println(map1);
    }

}
