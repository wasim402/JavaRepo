package DSA;

import java.util.Scanner;

public class StackUsingArray {
    private static final int Max_Size=10;
    private static int top=-1;
    private static int stack[] =new int[Max_Size];

   static Scanner sc = new Scanner(System.in);
    static int stackElements;
    static int input;
    static void main(String[] args) {
        menu();
        callingMenu();
        exit();
//        System.out.println(stackList);
//        System.out.println(stack);
    }

    public static void menu() {
        System.out.println("Select items");
        System.out.println("1.Push()");
        System.out.println("2.Pop()");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println();
        System.out.print("Choose menu items : ");
        input = sc.nextInt();
        retry();
    }
    public static void callingMenu() {
        while (input != 4) {
            if (input == 1) {
                push();
            } else if (input == 2) {
                pop();
            } else if (input == 3) {
                display();
            }
            menu();
        }
    }

    public static void push(){
        System.out.print("Enter Value to push : ");
        stackElements = sc.nextInt();
        if (top==Max_Size-1){
            System.out.println("Stack overflow");
        }
        else {
            top++;
            stack[top]=stackElements;
        }
    }
    public static void pop(){
        if (top==-1){
            System.out.println("Stack underflow");
        }
        else {
            System.out.println("Poped Element  " + stack[top]);
            stackElements =stack[top];
            top--;
        }
    }
    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("stack Elements : ");
            for (int i = top; i >=0 ; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void exit(){
        System.out.println("You are exit Now.");
    }
    public static void retry(){
        if (input>4){
            System.out.println("you have only 4 items please retry again");
        }
    }
}
