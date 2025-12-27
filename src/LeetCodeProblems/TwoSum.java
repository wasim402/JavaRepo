package LeetCodeProblems;

public class TwoSum {
    static void main(String[] args) {

        int [] num = {2,11,7,15};
        int target= 9;

        for (int i = 0; i <num.length ; i++) {

            for (int j = i+1; j <num.length ; j++) {
                   if (num[i]+num[j]==target){

                System.out.println(i +" "+ j);
                   }
            }

        }

    }
}
