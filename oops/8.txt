class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack obj1 = new Stack();
        Stack obj2 = new Stack();

        for (int i = 0; i < 10; i++)
            obj1.push(i);

        for (int i = 0; i < 10; i++)
            obj2.push(i);

        System.out.println("First Stack:");
        for (int i = 0; i < 10; i++)
            System.out.println(obj1.pop());

        System.out.println("Second Stack:");
        for (int i = 0; i < 10; i++)
            System.out.println(obj2.pop());
    }
}
