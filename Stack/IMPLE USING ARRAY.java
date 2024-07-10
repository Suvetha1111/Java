
import java.util.Scanner;
public class tack {
    private int[] stack;
    private int top;
    private int size;
    public tack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }
    public void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size:");
        int n = sc.nextInt();
        tack s = new tack(n);
        int choice = 1;
        while (choice != 0) {
            System.out.println("1 = PUSH\n2 = POP\n3 = PEEK\n4 = PRINT\nPress 0 to stop");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int peeked = s.peek();
                    if (peeked != -1) {
                        System.out.println("Peek element: " + peeked);
                    }
                    break;
                case 4:
                    s.show();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}
