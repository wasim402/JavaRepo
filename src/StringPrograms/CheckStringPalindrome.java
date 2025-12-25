package StringPrograms;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String expacted = "";
        boolean isPalindrome=false;
        for (int i = s.length() - 1; i >= 0; i--) {
            expacted+= s.charAt(i);
            if (expacted.equals(s)){
                isPalindrome=true;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
