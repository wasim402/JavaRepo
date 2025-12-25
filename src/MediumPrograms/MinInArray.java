package MediumPrograms;

public class MinInArray {
    static void main(String[] args) {
        int [] arr = {0,1,3,6,8,9,5};
        int min = arr[0];

        for (int i = 0; i <=arr.length-1 ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
