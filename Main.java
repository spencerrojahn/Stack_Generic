import java.util.*;

class Main {

    public static void main(String[] args) {

        System.out.println("Stack of INTs:");
        Stack<Integer> s_int = new Stack<Integer>();
        s_int.push(10); s_int.push(11); s_int.push(12); s_int.push(13); s_int.push(14);
        s_int.printStack();
        System.out.printf("Pop: %d\n", s_int.pop());
        s_int.printStack();
        System.out.printf("Peek: %d\n", s_int.peek());
        s_int.printStack();
        System.out.printf("Size: %d\n\n", s_int.size());
    
        System.out.println("Stack of STRINGs:");
        Stack<String> s_string = new Stack<String>();
        s_string.push("spencer"); s_string.push("bob"); s_string.push("jonathan"); s_string.push("steph"); s_string.push("billy");
        s_string.printStack();
        System.out.printf("Pop: %s\n", s_string.pop());
        s_string.printStack();
        System.out.printf("Peek: %s\n", s_string.peek());
        s_string.printStack();
        System.out.printf("Size: %d\n\n", s_string.size());
        
        System.out.println("Stack of INTs from LIST:");
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(new Integer[] {12, 43, 42, 54}));
        Stack<Integer> s_int_lst = new Stack<Integer>(lst);
        s_int_lst.printStack();
        System.out.printf("Pop: %d\n", s_int_lst.pop());
        s_int_lst.printStack();
        System.out.printf("Peek: %d\n", s_int_lst.peek());
        s_int_lst.printStack();
        System.out.printf("Size: %d\n\n", s_int_lst.size());
        
        

        // ArrayList<String> list = new ArrayList<String>();
        // list.add("hie");
        // list.add("sfdsaf");
        // list.add("dsafstc");
        // Stack<String> s2 = new Stack<String>(list);
        // s2.printStack();
    }
}