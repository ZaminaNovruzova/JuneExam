package org.example;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    List<T> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();

    }

    public T pop() {
        return stackList.get(stackList.size() - 1);

    }

    public void peek() {
        stackList.remove(stackList.size() - 1);

    }

    public int size() {
        return stackList.size();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackList=" + stackList +
                '}';
    }
}


