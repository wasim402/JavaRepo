package MediumPrograms;

public class OnlyDuplicates {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 5,};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < i; j++) {

                Boolean isRepeated = false;
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        isRepeated = true;
                        break;
                    }

                    if (isRepeated){
                        continue;
                    }

                if (arr[i] == arr[j]) {
                    count++;
                }

                }
                if (count > 1 ) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
