package MediumPrograms;

public class CheckArraySorted {
    static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6,7,13};
        boolean isSorted=true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i+1]<arr[i]){
                isSorted=false;
            }
        }
        System.out.println(isSorted);
    }

}
