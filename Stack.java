import java.util.*;

class Stack<T> {

    Node<T> top;

    // basic constructor
    public Stack() {
        this.top = null;
    }

    // constructor from list
    public Stack(List<T> lst) {
        this.top = null;
        for (int i = lst.size()-1; i >= 0; i--) {
            this.push(lst.get(i));
        }
    }

    // push operation
    public void push(T value) {
        if (this.top == null) {
            top = new Node<T>(value);
        } else {
            Node<T> newNode = new Node<T>(value);
            newNode.next = this.top;
            this.top = newNode; 
        }
    }

    // pop operation
    public T pop() {
        T topValue = this.top.value;
        this.top = top.next;
        return topValue;
    }

    // peek operation
    public T peek() {
        return this.top.value;
    }

    // size operation
    public int size() {
        int sz = 0;
        Node<T> curr = this.top;
        while (curr != null) {
            curr = curr.next;
            sz++;
        }
        return sz;
    }

    // print stack
    public void printStack() {
        System.out.print("Stack: [");
        Node<T> curr = this.top;
        while (curr != null) {
            if (curr.next != null) {
                System.out.print(curr.value);
                System.out.print(", ");
            } else {
                System.out.print(curr.value);
                System.out.println("]");
            }
            curr = curr.next;
        }
    }
}

