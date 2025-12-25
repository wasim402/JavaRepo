package MediumPrograms;

public class SumOFAllElement {
    static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        int index=0;

        for (int i = 0; i <=arr.length-1 ; i++) {


            sum=sum+arr[i];
            index=arr[i];


        }
        System.out.println(sum);
        System.out.println(index);
    }
}
