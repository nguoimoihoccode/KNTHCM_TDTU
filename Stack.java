public class Stack {
    private static final int MAX = 100;
    private int top;
    private int[] items;

    // Khởi tạo ngăn xếp
    public Stack() {
        items = new int[MAX];
        top = -1;
    }

    // Kiểm tra ngăn xếp có rỗng không
    public boolean isEmpty() {
        return top == -1;
    }

    // Kiểm tra ngăn xếp có đầy không
    public boolean isFull() {
        return top == MAX - 1;
    }

    // Thêm phần tử vào ngăn xếp
    public void push(int item) {
        if (isFull()) {
            System.out.println("Ngăn xếp đầy");
            return;
        }
        items[++top] = item;
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Ngăn xếp rỗng");
            return -1;
        }
        return items[top--];
    }

    // Lấy phần tử trên cùng của ngăn xếp
    public int peek() {
        if (isEmpty()) {
            System.out.println("Ngăn xếp rỗng");
            return -1;
        }
        return items[top];
    }

    // In các phần tử trong ngăn xếp
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Ngăn xếp rỗng");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
    // public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Phần tử trên cùng: " + stack.peek());

        System.out.println("Lấy ra: " + stack.pop());
        System.out.println("Lấy ra: " + stack.pop());
        System.out.println("Lấy ra: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("Ngăn xếp rỗng");
        } else {
            System.out.println("Ngăn xếp không rỗng");
        }
    }
}

// }
