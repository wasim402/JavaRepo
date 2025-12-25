package StringPrograms;

public class VowelAndConstants {
    static void main(String[] args) {
        String s = "s dfjdlkf oireioeojvdk K A O 1 1 1 1 2323iou4389437943 -1 -2 -3 -4";
        String s1= s.toLowerCase();

        int vowelCount=0;
        int constCount=0;
        int numberCount=0;
        int spaceCount=0;

        for (int i = 0; i <=s1.length()-1 ; i++) {

            switch (s1.charAt(i)) {
                case ' '-> spaceCount++;
                case 'a', 'e', 'i', 'o', 'u' -> vowelCount++;
                case '0', '1', '2', '3', '4','5','6','7','8','9' -> numberCount++;
                default -> constCount++;
            }
        }
        System.out.println("Vowel Counnt :"+vowelCount);
        System.out.println("Constant Counnt :"+constCount);
        System.out.println("Number Counnt :"+numberCount);
        System.out.println("Space Counnt :"+spaceCount);

    }
}
