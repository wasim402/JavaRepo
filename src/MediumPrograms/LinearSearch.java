package MediumPrograms;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9, 0, 5, 7, 9};
        int search = -5;

        int index =search(arr , search);
        if (index !=-1){
            System.out.println("Element is found at " +index);
        }
        else {
            System.out.println("Element not found");
        }

    }

    static int search(int [] arr ,int search) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (search == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}
