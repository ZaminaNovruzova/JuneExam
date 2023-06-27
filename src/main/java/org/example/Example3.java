package org.example;

public class Example3 {
    public static void main(String[] args) {
        //Stack generic class i
        Stack<String> stack=new Stack<>();
        stack.push("A");
        stack.push("B");

        System.out.println(stack);
     //   stack.peek();
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}
